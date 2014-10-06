package org.rapidpm.course.java8.jsr310.p06;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Map;
import java.util.TreeMap;

public class HelloWorld {
    final static TemporalAdjuster nextWorkDay = temporal -> {
    	// TODO refactor, generalize; here: only Germany, Lower Saxony, 2014
    	final Map<LocalDate, String> holidays = new TreeMap<LocalDate, String>();
    	holidays.put(LocalDate.of(2014,  1,  1), "Neujahr");
    	holidays.put(LocalDate.of(2014,  4, 18), "Karfreitag");
    	holidays.put(LocalDate.of(2014,  4, 21), "Ostermontag");
    	holidays.put(LocalDate.of(2014,  5,  1), "Tag der Arbeit");
    	holidays.put(LocalDate.of(2014,  5, 29), "Christi Himmelfahrt");
    	holidays.put(LocalDate.of(2014,  6,  9), "Pfingstmontag");
    	holidays.put(LocalDate.of(2014, 10,  3), "Einheit");
    	holidays.put(LocalDate.of(2014, 12, 25), "1. Weihnachtstag");
    	holidays.put(LocalDate.of(2014, 12, 26), "2. Weihnachtstag");
    	// now the actual code ... start with "tomorrow"
        LocalDate localDate = LocalDate.from(temporal).plusDays(1);
    	// skip all holidays
    	while (holidays.containsKey(localDate)) localDate = localDate.plusDays(1);
    	// skip weekend and return
        final DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        if (dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY) {
            final TemporalAdjuster next = TemporalAdjusters.next(DayOfWeek.MONDAY);
            return temporal.with(next);
        }
        else {
            return temporal.with(localDate);
        }
    };

	public static void main(String[] args) {
		LocalDate heute = LocalDate.of(2014, 10, 2);
		System.out.println(heute);
		System.out.println(heute.with(nextWorkDay));
	}
}
