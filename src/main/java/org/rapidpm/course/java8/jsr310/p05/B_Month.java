package org.rapidpm.course.java8.jsr310.p05;

import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

/**
 * Created by Sven Ruppert on 31.03.2014.
 */
public class B_Month {
	public static void main(final String[] args) {
		final Month month = Month.FEBRUARY;
		final Locale locale = Locale.getDefault();
		System.out.println(month.getDisplayName(TextStyle.FULL, locale));
		System.out.println(month.getDisplayName(TextStyle.NARROW, locale));
		System.out.println(month.getDisplayName(TextStyle.SHORT, locale));
		System.out.println(month.minLength());

		System.out.println("Minus 3 Monate");
		System.out.println(month.minus(3).getDisplayName(TextStyle.FULL, locale));

	}
}
