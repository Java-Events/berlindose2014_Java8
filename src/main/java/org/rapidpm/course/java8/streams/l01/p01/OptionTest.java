package org.rapidpm.course.java8.streams.l01.p01;

import java.util.Arrays;
import java.util.List;

public class OptionTest {

	final static List<String> deamoValues = Arrays.asList("AB", "AAB", "AAAB", "AAAAB", "AAAAAB", "AAAAAB");

	public static void main(String args[]) {
		final String first = deamoValues.stream().filter(v -> v.contains("AAAB")).findFirst().orElse("noop");
		System.out.println(first);
	}
}
