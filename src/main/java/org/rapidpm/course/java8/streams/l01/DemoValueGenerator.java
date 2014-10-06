package org.rapidpm.course.java8.streams.l01;

import org.rapidpm.course.java8.streams.model.Pair;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sven Ruppert on 06.10.2014.
 */
public class DemoValueGenerator {

  public List<Pair> generate(){
    final List<Pair> result = new ArrayList<>();

    result.add(new Pair.Builder().txt("A").counter(1).build());
    result.add(new Pair.Builder().txt("B").counter(1).build());
    result.add(new Pair.Builder().txt("C").counter(1).build());
    result.add(new Pair.Builder().txt("D").counter(1).build());
    return result;
  }



}
