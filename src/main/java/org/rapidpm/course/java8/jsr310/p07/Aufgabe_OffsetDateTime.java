package org.rapidpm.course.java8.jsr310.p07;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
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
		
		// ZoneOffset offset = ZoneOffset.of("-02:00");
		
		// Offset Berlin zu UTC
		ZoneId zoneIdBerlin = ZoneId.of("Europe/Berlin");
		ZonedDateTime timeInBerlin = date.atZone(zoneIdBerlin);
		final ZoneOffset offset = timeInBerlin.getOffset();

		OffsetDateTime dateOffset = OffsetDateTime.of(date, offset);
		OffsetDateTime lastThursday = dateOffset.with(TemporalAdjusters
				.lastInMonth(DayOfWeek.THURSDAY));
		System.out.printf("The last Thursday in April 2014 is the %sth.%n",
				lastThursday.getDayOfMonth());
	}
}
