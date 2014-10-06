package org.rapidpm.course.java8.streams.l01.p01;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class Match {

	final static List<Integer> deamoValues = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

	private static Stream<Integer> getStream() {
		return deamoValues.stream();
	};

	static final Function<Integer, Integer> f = (e) -> {
		System.out.println("e = " + e);
		return e;
	};

	public static void main(String args[]) {
		System.out.println("anyMatch " + getStream().map(f).anyMatch((v) -> v % 2 == 0));

	}
}
