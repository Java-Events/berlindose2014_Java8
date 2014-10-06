package org.rapidpm.course.java8.jsr310.lesson;

import java.time.*;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

/**
 * Created by Sven Ruppert on 31.03.2014.
 */
public class Loesung_OffsetDateTime {

    public static void main(String[] args) {
        final TemporalAdjuster adjuster = TemporalAdjusters.lastInMonth(DayOfWeek.THURSDAY);
        final LocalDateTime date = LocalDateTime.of(2014, Month.APRIL, 20, 19, 30);
        final ZoneId zoneId = ZoneId.of("Europe/Berlin");
        final ZonedDateTime zonedDateTime = date.atZone(zoneId);
        final ZoneOffset offset = zonedDateTime.getOffset();
        System.out.println("offset = " + offset.getId());
        final ZoneOffset zoneOffset = ZoneOffset.of(offset.getId());
        OffsetDateTime dateOffset = OffsetDateTime.of(date, zoneOffset);
        OffsetDateTime lastThursday = dateOffset.with(adjuster);
        System.out.printf("The last Thursday in April 2014 is the %sth.%n",
                lastThursday.getDayOfMonth());
    }


}
