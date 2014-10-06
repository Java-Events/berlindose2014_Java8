package org.rapidpm.course.java8.streams.l01;

import org.rapidpm.course.java8.streams.model.Pair;

import java.util.List;

/**
 * Created by Sven Ruppert on 06.10.2014.
 */
public class Main {

  public static void main(String[] args) {
    DemoValueGenerator  generator = new DemoValueGenerator();

    final List<Pair> generate = generator.generate();



  }


}
