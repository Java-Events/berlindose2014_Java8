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
		final ZoneOffset offset = ZoneOffset.of("-02:00");        
        printUsingOffsetSolution(date, offset);
	}

	private static void printUsingOffsetSolution(LocalDateTime date, ZoneOffset offset) {
        OffsetDateTime dateOffset = OffsetDateTime.of(date, offset);
		OffsetDateTime lastThursday =
                dateOffset.with(TemporalAdjusters.lastInMonth(DayOfWeek.THURSDAY));

        print(lastThursday.getDayOfMonth());
	}

	private static void print(int lastThursday) {
		System.out.printf("The last Thursday in April 2014 is the %sth.%n",
				lastThursday);
	}

	private static void printOffsetViaZoneId(LocalDateTime date) {
        final ZoneId zoneIdBerlin = ZoneId.of("Europe/Berlin");
        final ZonedDateTime zonedDateTime = date.atZone(zoneIdBerlin);
        
        final ZoneOffset offset = zonedDateTime.getOffset();
        printUsingOffsetSolution(date, offset);

        printNotUsingOffsetSolution(zonedDateTime);
	}

	private static void printNotUsingOffsetSolution(
			final ZonedDateTime zonedDateTime) {
		ZonedDateTime lastThursday =
        		zonedDateTime.with(TemporalAdjusters.lastInMonth(DayOfWeek.THURSDAY));

        print(lastThursday.getDayOfMonth());
	}

}