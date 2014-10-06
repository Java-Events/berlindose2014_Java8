package org.rapidpm.course.java8.lang;

/**
 * Created by Sven Ruppert on 06.10.2014.
 */
public interface Service {

  //  public void doIt();
  public default void doIt() {
    System.out.println("Service = doIt");
  }


}
