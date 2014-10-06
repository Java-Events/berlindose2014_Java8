package org.rapidpm.course.java8.jsr310.p09;

import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
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

		final Stream<Pair> stream = getStream(generate);

		handleStream(stream);
	}

	private static Stream<Pair> getStream(final List<Pair> generate) {
		final Stream<Pair> staticStreamOfSingleValues = Stream.of(
				generate.get(0), generate.get(1), generate.get(2),
				generate.get(3));
		final Stream<Pair> staticStreamOfArray = Stream.of(generate
				.toArray(new Pair[generate.size()]));
		final Stream<Pair> staticStreamOfList = generate.stream();

		final Stream<Pair> dynamicStreamOfSupplier = Stream.<Pair> builder()
				.add(new Pair.Builder().build()).build();
		Stream.generate(() -> {
			return new Pair.Builder().txt("Txt").counter(1).build();
		});

		// Irgendeinen dieser Streams zurückgeben
		return staticStreamOfSingleValues;
	}

	private static void handleStream(final Stream<Pair> stream) {
		// collect(stream);

		final Stream<Pair> streamFiltered = filter(stream);

		final Stream<String> streamMapped = map(streamFiltered);

		// forEach_Print(streamMapped);
		findFirst(streamMapped);
	}

	private static void collect(Stream<Pair> stream) {
		// final Object[] collectedArray = stream.toArray();
		//
		// final List<Pair> collectedList = stream.collect(Collectors.toList());
		//
		// final Set<Pair> collectedSet = stream.collect(Collectors.toSet());

		final Map<Integer, List<Pair>> collectedGroupingBy = stream
				.collect(Collectors.groupingBy(Pair::getCounter));
		// staticStreamOfSingleValues.collect(Collectors.toMap(,
		// valueMapper)());

		System.out.println(collectedGroupingBy);
	}

	private static Stream<Pair> filter(Stream<Pair> stream) {
		return stream.filter(v -> !"b".equalsIgnoreCase(v.getTxt()));
	}

	private static Stream<String> map(Stream<Pair> stream) {
		// Von Pair auf String mappen
		final Stream<String> mapped = stream.map(v -> {
			final String txt = v.getTxt();
			return txt;
		});

		return mapped;
	}

	private static <T> void forEach_Print(final Stream<T> stream) {
		// stream.forEach(v -> System.out.println(v));
		// stream.forEachOrdered(v -> System.out.println(v));
		// stream.forEachOrdered(v -> System.out.println(v));
		Consumer<? super T> consumer = System.out::println;
		stream.forEachOrdered(consumer);
	}

	private static void findFirst(Stream<String> stream) {
		final String string = stream.filter(o -> o.contains("A")).findFirst()
				.orElse("not found");

		System.out.println(string);
	}

}