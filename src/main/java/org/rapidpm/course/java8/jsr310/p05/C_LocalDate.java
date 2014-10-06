package org.rapidpm.course.java8.jsr310.p05;

import static java.time.LocalDate.now;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
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

		System.out.println(date.atStartOfDay().getSecond());
		System.out.println(date.with(TemporalAdjusters.nextOrSame(DayOfWeek.MONDAY)));

		final LocalDate now = now();
		System.out.println(now.getChronology());
		System.out.println(now.format(DateTimeFormatter.ofPattern("MM-dd")));

		System.out.println(LocalDate.of(2012, 2, 29).plus(365, ChronoUnit.DAYS));

	}
}
