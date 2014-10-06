package org.rapidpm.course.java8.streams.l01.p06;

import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

import org.rapidpm.course.java8.streams.l01.DemoValueGenerator;
import org.rapidpm.course.java8.streams.model.Pair;

public class Test {

	public static void main(String[] args) {
		// base data
		List<Pair> list = new DemoValueGenerator().generate();
		
		// using Collection
		list.stream();

		// builder
		Builder<Pair> streamBuilder = Stream.<Pair>builder();
		for (Pair p : list) {
			streamBuilder.add(p);
		}
		Stream<Pair> stream = streamBuilder.build();

		// supplier
		Stream.generate(() -> {
			return list;
		});
	}

}
