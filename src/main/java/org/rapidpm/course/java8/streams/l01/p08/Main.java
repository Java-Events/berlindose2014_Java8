package org.rapidpm.course.java8.streams.l01.p08;

import org.rapidpm.course.java8.streams.l01.DemoValueGenerator;
import org.rapidpm.course.java8.streams.model.Pair;

/**
 * Created by Sven Ruppert on 06.10.2014.
 */
public class Main {

	public static void main(final String[] args) {
		final DemoValueGenerator generator = new DemoValueGenerator();
		//		final Stream<Pair> stream = generator.generate().stream();
		//		final Stream<Pair> of = Stream.of(new Pair.Builder().counter(1).txt("A").build());
		//		final Stream<Pair> add = Stream.<Pair> builder().add(new Pair.Builder().counter(1).txt("A").build()).build();
		//		final Stream<Pair> generate = Stream.<Pair> generate(() -> new Pair.Builder().counter(1).txt("A").build());
		//
		//		final Map<Integer, List<Pair>> collect = stream.collect(Collectors.groupingBy(Pair::getCounter));
		//		final Set<Pair> collect2 = of.collect(Collectors.toSet());
		//		final List<Pair> collect3 = add.collect(Collectors.toList());
		//		final Pair[] array = generate.toArray(Pair[]::new);

		/*final Stream<String> map = */generator.generate().stream().map(Pair::getTxt).forEach(System.out::println);
		;
	}

}
