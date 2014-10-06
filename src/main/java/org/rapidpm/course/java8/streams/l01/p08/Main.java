package org.rapidpm.course.java8.streams.l01.p08;

import java.util.List;
import java.util.stream.Stream;

import org.rapidpm.course.java8.streams.l01.DemoValueGenerator;
import org.rapidpm.course.java8.streams.model.Pair;

/**
 * Created by Sven Ruppert on 06.10.2014.
 */
public class Main {

	public static void main(final String[] args) {
		final DemoValueGenerator generator = new DemoValueGenerator();

		final List<Pair> generate = generator.generate();
		final Stream<Pair> stream1 = generate.stream();
		final Stream<Pair> stream2 = Stream.of(new Pair.Builder().counter(1).txt("A").build());
		final Stream<Pair> stream3 = Stream.<Pair> builder().add(new Pair.Builder().counter(1).txt("A").build()).build();
		final Stream<Pair> stream4 = Stream.<Pair> generate(() -> new Pair.Builder().counter(1).txt("A").build());

	}


}
