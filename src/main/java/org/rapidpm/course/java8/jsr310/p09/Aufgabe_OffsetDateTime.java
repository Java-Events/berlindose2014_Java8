package org.rapidpm.course.java8.jsr310.p09;

import java.time.*;
import java.time.temporal.TemporalAdjusters;

/**
 *
 * Ersetze die Angabe -02:00 durch die ZeitZone Europe/Berlin
 *
 *
 * Created by Sven Ruppert on 31.03.2014.
 */
public class Aufgabe_OffsetDateTime {

	public static void main(String[] args) {
        LocalDateTime date = LocalDateTime.of(2014, Month.APRIL, 20, 19, 30);

        printOffsetViaZoneOffset(date);

        printOffsetViaZoneId(date);
    }

	private static void printOffsetViaZoneOffset(LocalDateTime date) {
		ZoneOffset offset = ZoneOffset.of("-02:00");
        OffsetDateTime dateOffset = OffsetDateTime.of(date, offset);
        OffsetDateTime lastThursday =
                dateOffset.with(TemporalAdjusters.lastInMonth(DayOfWeek.THURSDAY));

        System.out.printf("The last Thursday in April 2014 is the %sth.%n",
                lastThursday.getDayOfMonth());
	}

	private static void printOffsetViaZoneId(LocalDateTime date) {
        final ZoneId zoneIdBerlin = ZoneId.of("Europe/Berlin");
        final ZonedDateTime zonedDateTime = date.atZone(zoneIdBerlin);
        ZonedDateTime lastThursday =
        		zonedDateTime.with(TemporalAdjusters.lastInMonth(DayOfWeek.THURSDAY));

        System.out.printf("The last Thursday in April 2014 is the %sth.%n",
                lastThursday.getDayOfMonth());
	}
    
}