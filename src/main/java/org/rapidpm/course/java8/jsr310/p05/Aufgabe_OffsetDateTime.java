package org.rapidpm.course.java8.jsr310.p05;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
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
	public static void main(final String[] args) {
		final LocalDateTime date = LocalDateTime.of(2014, Month.APRIL, 20, 19, 30);
		final ZonedDateTime dateOffset = ZonedDateTime.of(date, ZoneId.of("Europe/Berlin"));
		final ZonedDateTime lastThursday = dateOffset.with(TemporalAdjusters.lastInMonth(DayOfWeek.THURSDAY));
		System.out.printf("The last Thursday in April 2014 is the %sth.%n", lastThursday.getDayOfMonth());
	}
}
