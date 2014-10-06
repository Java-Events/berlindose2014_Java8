package org.rapidpm.course.java8.jsr310.p04;

import java.sql.Time;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.MonthDay;
import java.time.temporal.ChronoField;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.TemporalField;

/**
 * Created by Sven Ruppert on 31.03.2014.
 */
public class M_TemporalAdjuster {

    final String demoString = "sssss";

    final static TemporalAdjuster adjuster = temporal -> {
        final LocalDate localDate = LocalDate.from(temporal);
//        final DayOfWeek dayOfWeek = localDate.getDayOfWeek();
//        if (dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY) {
//            final TemporalAdjuster next = TemporalAdjusters.next(DayOfWeek.MONDAY);
//            return temporal.with(next);
//        } else {
//            return temporal.with(localDate);
//        }
        final LocalDate localDate2= localDate.with(ChronoField.DAY_OF_MONTH,  localDate.getMonth().length(false)/2);
        return temporal.with(localDate2);
    };

    public static void main(String[] args) {
        LocalDateTime date = LocalDateTime.of(2014, Month.FEBRUARY, 3,19,0);
        DayOfWeek dotw = date.getDayOfWeek();
        System.out.printf("%s is on a %s%n", date, dotw);
        System.out.printf("first day of Month: %s%n",
                date.with(TemporalAdjusters.firstDayOfMonth()));

        final LocalDateTime d1 = date.with(new MyTemporalAdjuster());
        System.out.println("d1 = " + d1);



        final LocalDateTime d1x = date.with(adjuster);
        System.out.println("d1x = " + d1x);

        final LocalDateTime dateSa = LocalDateTime.of(2014, Month.APRIL, 5,19,0);
        System.out.println("d2 = " + dateSa.with(new MyTemporalAdjuster()));

    }


    /**
     * get next Monday if WeekEnd
     */
    public static class MyTemporalAdjuster implements TemporalAdjuster {
        @Override
        public Temporal adjustInto(Temporal temporal) {
            final LocalDateTime localDate = LocalDateTime.from(temporal);
            final DayOfWeek dayOfWeek = localDate.getDayOfWeek();
            if (dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY) {
                final TemporalAdjuster next = TemporalAdjusters.next(DayOfWeek.MONDAY);
                return temporal.with(next);
            } else
            if(localDate.toLocalTime().isAfter(LocalTime.of(18, 00))){
                return temporal.with(localDate.plusDays(1).with(ChronoField.CLOCK_HOUR_OF_DAY, 8));
            }else{
            	return temporal.with(localDate);
            }
        }
    }


}
