package org.rapidpm.course.java8.jsr310;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

/**
 * Created by Sven Ruppert on 31.03.2014.
 */
public class M_TemporalAdjuster {

	final String demoString = "sssss";

	//    final static TemporalAdjuster adjuster = temporal -> {
	//        final LocalDate localDate = LocalDate.from(temporal);
	//        final DayOfWeek dayOfWeek = localDate.getDayOfWeek();
	//        if (dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY) {
	//            final TemporalAdjuster next = TemporalAdjusters.next(DayOfWeek.MONDAY);
	//            return temporal.with(next);
	//        } else {
	//            return temporal.with(localDate);
	//        }
	//    };

	final static TemporalAdjuster adjuster = new TemporalAdjuster() {

		@Override
		public Temporal adjustInto(final Temporal temporal) {
			return temporal;
		}
	};

	public static void main(final String[] args) {
		final LocalDate date = LocalDate.of(2014, Month.APRIL, 3);
		final DayOfWeek dotw = date.getDayOfWeek();
		System.out.printf("%s is on a %s%n", date, dotw);
		System.out.printf("first day of Month: %s%n", date.with(TemporalAdjusters.firstDayOfMonth()));

		final LocalDate d1 = date.with(new MyTemporalAdjuster());
		System.out.println("d1 = " + d1);



		final LocalDate d1x = date.with(adjuster);
		System.out.println("d1x = " + d1x);

		final LocalDate dateSa = LocalDate.of(2014, Month.APRIL, 5);
		System.out.println("d2 = " + dateSa.getDayOfWeek());
		System.out.println("d2 = " + dateSa.with(new MyTemporalAdjuster()).getDayOfWeek());

	}


	/**
	 * get next Monday if WeekEnd
	 */
	public static class MyTemporalAdjuster implements TemporalAdjuster {
		@Override
		public Temporal adjustInto(final Temporal temporal) {
			return temporal.minus(15, ChronoUnit.CENTURIES);
			//			return temporal;
		}
	}
}
