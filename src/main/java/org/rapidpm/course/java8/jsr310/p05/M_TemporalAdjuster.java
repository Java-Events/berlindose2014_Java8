package org.rapidpm.course.java8.jsr310.p05;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

/**
 * Created by Sven Ruppert on 31.03.2014.
 */
public class M_TemporalAdjuster {

	final static TemporalAdjuster adjusterGeschaeftsszeit = new TemporalAdjuster() {

		@Override
		public Temporal adjustInto(final Temporal temporal) {
			final LocalTime from = LocalTime.from(temporal);
			if (from.isAfter(LocalTime.of(17, 0, 0))) {
				return temporal.with(ChronoField.HOUR_OF_DAY, 9).with(ChronoField.MINUTE_OF_HOUR, 0);
			}
			return temporal.with(from);
		}
	};

	final static TemporalAdjuster adjusterRuhetag = temporal -> {
		final LocalDate localDate = LocalDate.from(temporal);

		if (localDate.getDayOfWeek() == DayOfWeek.MONDAY) {
			final TemporalAdjuster next = TemporalAdjusters.next(DayOfWeek.TUESDAY);
			return temporal.with(next);
		} else {
			return temporal.with(localDate);
		}
	};

	public static void main(final String[] args) {
		final LocalDateTime date = LocalDateTime.of(2014, Month.APRIL, 3, 17, 44);
		final LocalDateTime ruhetag = date.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
		System.out.println(date);
		System.out.println(ruhetag);

		final LocalDateTime d1 = ruhetag.with(adjusterRuhetag).with(adjusterGeschaeftsszeit);
		System.out.println("d1 = " + d1);
	}

}
