package org.rapidpm.course.java8.streams.l01.p01;

import java.util.Arrays;
import java.util.List;

public class Reduce {

	final static List<String> deamoValues = Arrays.asList("A", "B", "C", "D", "E", "F");

	public static void main(String args[]) {
		System.out.println(deamoValues.stream().reduce(String::concat).get());

		System.out.println(deamoValues.stream().reduce("X_", (v1, v2) -> {
			System.out.println("V1 = " + v1);
			System.err.println("V2 = " + v2);
			return v1.concat(v2) + "_";
		}));

		System.out.println(deamoValues.parallelStream().reduce("X_", (v1, v2) -> {
			System.out.println("V1 = " + v1);
			System.err.println("V2 = " + v2);
			return v1.concat(v2) + "_";
		}));
	}
}
