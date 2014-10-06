package org.rapidpm.course.java8.jsr310.p09;

import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

/**
 * Created by Sven Ruppert on 31.03.2014.
 */
public class B_Month {

	public static void main(String[] args) {
    	final Month month = getMonth();
        
        printAllWithDefaultLocale(month);
    }

	private static Month getMonth() {
		final Month month = Month.AUGUST;
        final Month minus = month.minus(3);
		return minus;
	}

	private static void printAllWithDefaultLocale(final Month minus) {
		final Locale locale = Locale.getDefault();
        printAll(minus, locale);
	}

	private static void printAll(Month month, Locale locale) {
		System.out.println(month.getDisplayName(TextStyle.FULL, locale));
        System.out.println(month.getDisplayName(TextStyle.NARROW, locale));
        System.out.println(month.getDisplayName(TextStyle.SHORT, locale));
	}
	
}