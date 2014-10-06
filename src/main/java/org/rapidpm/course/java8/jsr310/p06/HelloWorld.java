package org.rapidpm.course.java8.jsr310.p06;

import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class HelloWorld {
	public static void main(String[] args) {
		ZonedDateTime berlin = ZonedDateTime.now();
		ZonedDateTime london = ZonedDateTime.now(ZoneId.of("Europe/London"));
		DateTimeFormatter pattern = DateTimeFormatter.ofPattern("VV: yyyy-MM-dd - hh:mm:ss");
		System.out.println(berlin.format(pattern));
		System.out.println(london.format(pattern));
	}
}
