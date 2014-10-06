package org.rapidpm.course.java8.jsr310.p09;

import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneOffset;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Objects;

/**
 * Created by ts40 on 31.03.2014.
 */
public class C_LocalDate {
	
    public static void main(String[] args) {
    	final LocalDate date = LocalDate.of(2014, Month.APRIL, 3);
    	final LocalDate nextWed = date.with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY));
        System.out.println("nextWed = " + nextWed);

        final DayOfWeek dotw = date.getDayOfWeek();
        System.out.println("dotw = " + dotw);
        
        date.with(TemporalAdjusters.dayOfWeekInMonth(5, DayOfWeek.MONDAY)); // Der Montag fünf Wochen später
        
//        final TemporalAdjuster TWO_DAYS_LATER = TemporalAdjusters.ofDateAdjuster(/*LocalDate*/ date -> date.plusDays(2));
//        date.with(TemporalAdjusters.ofDateAdjuster(TWO_DAYS_LATER));
        
        final LocalDate monatsLetzter = LocalDate.of(2014, Month.AUGUST, 31);
        final LocalDate plusMonths = monatsLetzter.plusMonths(1);
        System.out.println("plusMonths = " + plusMonths);

        final LocalDate feb29 = LocalDate.of(2016, Month.FEBRUARY, 29);
        final LocalDate plusYears = feb29.plusYears(1);
        System.out.println("plusYears = " + plusYears);

        
        //        Objects.requireNonNull(null);
    }
    
}