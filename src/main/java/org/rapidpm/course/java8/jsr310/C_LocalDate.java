package org.rapidpm.course.java8.jsr310;

import java.time.*;
import java.time.temporal.TemporalAdjusters;

import static java.time.LocalDate.now;

/**
 * Created by ts40 on 31.03.2014.
 */
public class C_LocalDate {
  public static void main(String[] args) {
    LocalDate date = LocalDate.of(2014, Month.APRIL, 3);
    LocalDate nextWed = date.with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY));
    System.out.println("nextWed = " + nextWed);

    DayOfWeek dotw = LocalDate.of(2014, Month.APRIL, 3).getDayOfWeek();
    System.out.println("dotw = " + dotw);
    final int dayOfMonth = LocalDate.of(2014, Month.APRIL, 3).getDayOfMonth();
    final int dayOfYear = LocalDate.of(2014, Month.APRIL, 3).getDayOfYear();
    System.out.println("dayOfMonth = " + dayOfMonth);
    System.out.println("dayOfYear = " + dayOfYear);

    final LocalDate now = now();
  }
}
