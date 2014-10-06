package org.rapidpm.course.java8.streams.optional;

import java.util.Optional;

/**
 * Created by Sven Ruppert on 06.10.2014.
 */
public class Main {


  public static void main(String[] args) {

    final Optional<String> hallo = Optional.of("Hallo");

    final boolean present = hallo.isPresent();


  }
}
