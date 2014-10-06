package org.rapidpm.course.java8.streams.l01;

import java.util.List;
import java.util.stream.Stream;

import org.rapidpm.course.java8.streams.model.Pair;

/**
 * Created by Sven Ruppert on 06.10.2014.
 */
public class Main {

	public static void main(String[] args) {
		DemoValueGenerator generator = new DemoValueGenerator();

		final List<Pair> generatedList = generator.generate();

	}

}
