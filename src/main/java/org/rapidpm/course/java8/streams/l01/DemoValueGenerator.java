package org.rapidpm.course.java8.streams.l01;

import java.util.ArrayList;
import java.util.List;

import org.rapidpm.course.java8.streams.model.Pair;

/**
 * Created by Sven Ruppert on 06.10.2014.
 */
public class DemoValueGenerator {

	public List<Pair> generate() {
		final List<Pair> result = new ArrayList<>();

		for (int i = 0; i < 10000; i++) {
			result.add(new Pair.Builder().txt("A" + i).counter(i).build());
			result.add(new Pair.Builder().txt("B" + i).counter(i).build());
			result.add(new Pair.Builder().txt("C" + i).counter(i).build());
			result.add(new Pair.Builder().txt("D" + i).counter(i).build());
		}
		return result;
	}



}
