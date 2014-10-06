package org.rapidpm.course.java8.streams.l01.p01;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.rapidpm.course.java8.streams.l01.DemoValueGenerator;
import org.rapidpm.course.java8.streams.model.Pair;

/**
 * Created by Sven Ruppert on 06.10.2014.
 */
public class Main {

	public static void main(String[] args) {
		DemoValueGenerator generator = new DemoValueGenerator();

		final List<Pair> generate = generator.generate();

		Stream<Pair> stream1 = Stream.of(generate.toArray(new Pair[generate.size()]));
		Stream<Pair> stream2 = generate.stream();

		Stream<Pair> stream3 = Stream.generate(
				() -> {

					return new Pair.Builder().txt(String.valueOf(new Random().nextInt()))
							.counter(new Random().nextInt(10)).build();
				}).limit(30);

		stream1.collect(Collectors.toList());
		stream2.collect(Collectors.toSet());

		System.err.println("limit");
		stream3.forEach(System.out::println);
		System.err.println("limit");

		generate.stream().limit(30).forEach(System.out::println);
		generate.stream().limit(30).forEach(v -> System.out.println(v));
		//
		// Stream<String> stringers = generate.stream().map(v -> {
		// String reter = v.getTxt() + v.getCounter();
		// return reter;
		// });
		//
		// stringers.forEach(System.out::println);
		//
		// generate.stream().filter(v ->
		// !v.getTxt().equals("B")).forEach(System.out::println);

	}
}
