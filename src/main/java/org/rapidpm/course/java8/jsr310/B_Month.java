package org.rapidpm.course.java8.jsr310;

import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

/**
 * Created by Sven Ruppert on 31.03.2014.
 */
public class B_Month {
  public static void main(String[] args) {
    Month month = Month.FEBRUARY;
    Locale locale = Locale.getDefault();
    System.out.println(month.getDisplayName(TextStyle.FULL, locale));
    System.out.println(month.getDisplayName(TextStyle.NARROW, locale));
    System.out.println(month.getDisplayName(TextStyle.SHORT, locale));

    final int i = month.maxLength();
    System.out.println("i = " + i);

    final Month of = Month.of(2);
    System.out.println("of = " + of);

    final Month[] values = Month.values();
    for (final Month value : values) {
      System.out.println("value = " + value);
    }

  }
}
