package org.rapidpm.course.java8.jsr310.p09;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.TemporalField;
import java.util.Iterator;

/**
 * Created by Sven Ruppert on 31.03.2014.
 */
public class M_TemporalAdjuster {

    final String demoString = "sssss";

    final static TemporalAdjuster adjuster = temporal -> {
        final LocalDate localDate = LocalDate.from(temporal);
        final DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        if (dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY) {
            final TemporalAdjuster next = TemporalAdjusters.next(DayOfWeek.MONDAY);
            return temporal.with(next);
        } else {
            return temporal.with(localDate);
        }
    };

    final static TemporalAdjuster toNextWorkingDay = new TemporalAdjuster() {

		@Override
		public Temporal adjustInto(Temporal temporal) {
			final LocalDate localDate = LocalDate.from(temporal);
			final DayOfWeek dayOfWeek = localDate.getDayOfWeek();
			if (dayOfWeek == DayOfWeek.FRIDAY || dayOfWeek == DayOfWeek.SATURDAY) {
	            final TemporalAdjuster next = TemporalAdjusters.next(DayOfWeek.MONDAY);
	            return temporal.with(next);

			} else {
	            return temporal.with(localDate.plusDays(1));
	        }
		}
    	
    };
    
    final static TemporalAdjuster toFirstDayOfCurrentWeek = new TemporalAdjuster() {
    	
    	@Override
    	public Temporal adjustInto(Temporal temporal) {
    		final LocalDate localDate = LocalDate.from(temporal);
    		final DayOfWeek dayOfWeek = localDate.getDayOfWeek();
    		if (dayOfWeek == DayOfWeek.MONDAY) {
    			return temporal;
    		} 
    		
    		final TemporalAdjuster previousMonday = TemporalAdjusters.previous(DayOfWeek.MONDAY);
    		return temporal.with( previousMonday);
    	}
    	
    };
    
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2014, Month.APRIL, 3);
        DayOfWeek dotw = date.getDayOfWeek();
        System.out.printf("%s is on a %s%n", date, dotw);
        System.out.printf("first day of Month: %s%n",
                date.with(TemporalAdjusters.firstDayOfMonth()));

        final LocalDate d1 = date.with(new MyTemporalAdjuster());
        System.out.println("d1 = " + d1);



        final LocalDate d1x = date.with(adjuster);
        System.out.println("d1x = " + d1x);

        final LocalDate dateSa = LocalDate.of(2014, Month.APRIL, 5);
        System.out.println("d2 = " + dateSa.with(new MyTemporalAdjuster()));

        System.out.println("//");

        
        final LocalDate now = LocalDate.now();
        final LocalDate firstMondayThisWeek = now.with(toFirstDayOfCurrentWeek); // Der erste Montag der aktuellen Woche
        for (DayOfWeek dayOfWeek : DayOfWeek.values()) {
        	final LocalDate day = firstMondayThisWeek.with(TemporalAdjusters.nextOrSame(dayOfWeek)); // Der nächste Montag, Dienstag, ...
			System.out.println(day + ": " + day.with(toNextWorkingDay));
		}
    }


    /**
     * get next Monday if WeekEnd
     */
    public static class MyTemporalAdjuster implements TemporalAdjuster {
        @Override
        public Temporal adjustInto(Temporal temporal) {
            final LocalDate localDate = LocalDate.from(temporal);
            final DayOfWeek dayOfWeek = localDate.getDayOfWeek();
            if (dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY) {
                final TemporalAdjuster next = TemporalAdjusters.next(DayOfWeek.MONDAY);
                return temporal.with(next);
            } else {
                return temporal.with(localDate);
            }
        }
    }


}
