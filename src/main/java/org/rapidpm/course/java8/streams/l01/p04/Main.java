package org.rapidpm.course.java8.streams.l01.p04;

import java.util.stream.Stream;

import org.rapidpm.course.java8.streams.model.Pair;

public class Main {
public static void main(String[] args) {
	Streams streams = new Streams();
	Stream<Pair> streamByGenerator = streams.getStreamByGenerator();
	streams.print(streamByGenerator);
	
	streamByGenerator = streams.getStreamByGenerator();
	Stream<String> texts = streams.getTexts(streamByGenerator);
	streams.print(texts);
	
	streamByGenerator = streams.getStreamByGenerator();
	streams.print(streams.filterByTextExclusive(streamByGenerator, "B"));
}
}
