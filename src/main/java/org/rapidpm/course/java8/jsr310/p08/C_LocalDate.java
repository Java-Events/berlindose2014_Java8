package org.rapidpm.course.java8.jsr310.p08;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

/**
 * Created by ts40 on 31.03.2014.
 */
public class C_LocalDate {
	public static void main(final String[] args) {
		final LocalDate date = LocalDate.of(2014, Month.APRIL, 3);
		final LocalDate nextWed = date.with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY));
		System.out.println("nextWed = " + nextWed);

		final DayOfWeek dotw = LocalDate.of(2014, Month.APRIL, 3).getDayOfWeek();
		System.out.println("dotw = " + dotw);

		System.out.println(nextWed.atTime(12, 15).minusMinutes(16).minusHours(12).format(DateTimeFormatter.ISO_DATE_TIME));
	}
}
