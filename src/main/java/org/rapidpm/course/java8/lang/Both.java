package org.rapidpm.course.java8.lang;

/**
 * Created by Sven Ruppert on 06.10.2014.
 */
public class Both implements Service, Service_B {
  @Override
  public void doIt() {
    System.out.println("Both = doIt");
  }
}
