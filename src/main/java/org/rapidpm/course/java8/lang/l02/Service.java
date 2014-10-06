package org.rapidpm.course.java8.lang.l02;

/**
 * Created by Sven Ruppert on 06.10.2014.
 */
@FunctionalInterface
public interface Service {
  public void doIt_A();
  public default void doIt_B() { };
}



