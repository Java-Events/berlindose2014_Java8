package org.rapidpm.course.java8.streams.l01.p08;

import org.rapidpm.course.java8.streams.l01.DemoValueGenerator;
import org.rapidpm.course.java8.streams.model.Pair;

/**
 * Created by Sven Ruppert on 06.10.2014.
 */
public class Main {

	public static void main(final String[] args) {
		final DemoValueGenerator generator = new DemoValueGenerator();

		generator.generate().stream().//
		filter(v -> !"B".equals(v.getTxt())).//
		map(Pair::getTxt).//
		forEach(System.out::println);
		;
	}
}
