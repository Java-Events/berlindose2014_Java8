package org.rapidpm.course.java8.jsr310.p04;

import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.temporal.TemporalAdjusters;

/**
 * Created by ts40 on 31.03.2014.
 */
public class C_LocalDate {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2014, Month.APRIL, 3);
        LocalDate nextWed = date.with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY));
        System.out.println("nextWed = " + nextWed);

        DayOfWeek dotw = LocalDate.of(2014, Month.APRIL, 3).getDayOfWeek();
        System.out.println("dotw = " + dotw);
        
        LocalDate of = LocalDate.of(2007, 5, 20);
        System.out.println(of);
        for (String string : ZoneId.getAvailableZoneIds()) {
			System.out.println(string);
		}
        LocalDateTime now = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        
        System.out.println(now);
        Instant now2 = Instant.now();
        System.out.println(now2);
    }
}
