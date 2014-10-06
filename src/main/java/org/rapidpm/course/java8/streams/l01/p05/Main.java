package org.rapidpm.course.java8.streams.l01.p05;

import java.util.List;
import java.util.Optional;
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

		final Stream<Pair> streamFromBuilder = Stream.<Pair> builder().add(new Pair.Builder().txt("a").counter(1).build()).build();

		final Stream<Pair> streamFromList = Stream.<Pair> of(generator.generate().toArray(new Pair[0]));

		final Stream<Pair> streamFromLambda = Stream.<Pair> generate(() -> {
			return new Pair.Builder().txt("a").counter(1).build();
		});


		//		final List<Pair> list = streamFromBuilder.collect(Collectors.toList());
		//		final Set<Pair> set = streamFromList.collect(Collectors.toSet());
		//		final Map<Integer, List<Pair>> map = streamFromLambda.collect(Collectors.groupingBy(Pair::getCounter));

		//		generate.forEach(System.out::println);
		//		System.out.println("==========");

		//		generate.stream().forEachOrdered(System.out::println);
		//		System.out.println("==========");

		final Stream<String> stringStream = generate.stream().parallel().map(value -> value.getTxt());
		//		stringStream.forEach(System.out::println);
		//		System.out.println("==========");

		//		final Stream<String> filteredStringStream = stringStream.filter(value -> "B".equals(value));
		//		filteredStringStream.forEach(System.out::println);
		//		System.out.println("==========");

		//		final String filtered = stringStream//
		//				.filter(value -> value.contains("C"))//
		//				.findFirst()//
		//				.orElse("foo");
		//
		//		System.out.println(filtered);
		//		System.out.println("==========");

		final Optional<String> reduced = generate.stream()//
				.map(value -> value.getTxt())//
				.reduce((v1, v2) -> {
					return v1.concat(v2);
				});

		System.out.println(reduced.get());
		System.out.println("==========");

	}
}
