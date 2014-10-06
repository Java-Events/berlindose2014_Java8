package org.rapidpm.course.java8.streams.l01.p04;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

import org.rapidpm.course.java8.streams.l01.DemoValueGenerator;
import org.rapidpm.course.java8.streams.model.Pair;

public class Streams {
	Stream<Pair> getStreamByBuilder(){
		Builder<Pair> builder = Stream.<Pair>builder();
		builder.add(new Pair.Builder().txt("A").counter(1).build());
		builder.add(new Pair.Builder().txt("B").counter(2).build());
		return builder.build();
	}
	
	Stream<Pair> getStreamByGenerator(){
		return new DemoValueGenerator().generate().stream();
	}
	
	List<Pair> getList(Stream<Pair> stream){
		return stream.collect(Collectors.toList());
	}
	
	Set<Pair> getSet(Stream<Pair> stream){
		return stream.collect(Collectors.toSet());
	}
	Map<Integer,List<Pair>> getMap(Stream<Pair> stream){
		return stream.collect(Collectors.groupingBy(Pair::getCounter));
	}
	
	void print(Stream<?> stream){
		stream.forEach(System.out::println);
	}
	
	Stream<String> getTexts(Stream<Pair> stream){
		return stream.map(v->{
			return v.getTxt();
			
		});
	}
	
	Stream<Pair> filterByTextExclusive(Stream<Pair> stream,final String txt){
		return stream.filter(v->{
			return !v.getTxt().equals(txt);
		});
	}
}
