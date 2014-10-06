package org.rapidpm.course.java8.streams.l01.p07;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import org.rapidpm.course.java8.streams.model.Pair;

/**
 * Created by Sven Ruppert on 06.10.2014.
 */
public class Main {

	public static void main(String[] args) {
		DemoValueGenerator generator = new DemoValueGenerator();

		final List<Pair> generatedList = generator.generate();
		
		Stream<Pair> stream1 = generatedList.stream();
//	    Stream<Pair> stream2 = Stream.<Pair>builder().add(new Pair.Builder().counter(1).txt("txt").build()).build();
//		Stream<Pair> stream3 = Stream.generate(() ->  new Pair.Builder().counter(1).txt("txt").build());
		
//		stream1.forEachOrdered(p -> System.out.println(p.getCounter() +": "+p.getTxt()));
//		stream1.forEachOrdered(System.out::println);
		
//		Pair[] array = stream1.toArray(Pair[]::new);
//		Set<Pair> collectedToSet = stream1.collect(Collectors.toSet());
//		Map<Integer, List<Pair>> collectedToMap = stream1.collect(Collectors.groupingBy(Pair::getCounter));
		
//		Stream<String> pairTxtStream = stream1.map(p -> {
//			return p.getTxt();
//		});
		
//		Stream<String> pairTxtStream = stream1.map(p -> p.getTxt());
		
//		Stream<String> filteredStream = pairTxtStream.filter(p -> !p.equals("B"));
//		filteredStream.forEach(System.out::println);
		
		List<String> stringList = Arrays.asList("AA", "AAX", "AAA", "AAAB", "AAAAB");
		Optional<String> firstAAA = stringList.stream().filter(s -> s.contains("AAA")).findFirst();
		System.out.println(firstAAA.isPresent() ? firstAAA.get(): "not present");

	}

}
