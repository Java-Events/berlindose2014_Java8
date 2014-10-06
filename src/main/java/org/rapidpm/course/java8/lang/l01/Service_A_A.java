package org.rapidpm.course.java8.lang.l01;

/**
 * Created by Sven Ruppert on 06.10.2014.
 */
public interface Service_A_A extends Service_A{
  @Override public default void doIt(){
    System.out.println("Service_A_A");
    System.out.println(this.getClass().getSimpleName());
  };
}
