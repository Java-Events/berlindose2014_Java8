package org.rapidpm.course.java8.streams.l01.p01;

import java.util.Random;
import java.util.stream.Stream;

public class Distinct {

	public static void main(String args[]) {
		Random random = new Random();

		Stream.generate(() -> random.nextInt(100)).limit(40).distinct().forEach(System.out::println);

	}
}
