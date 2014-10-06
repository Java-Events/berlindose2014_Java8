package org.rapidpm.course.java8.lang.l01;

/**
 * Created by Sven Ruppert on 06.10.2014.
 */
public interface Service_A extends Service {
  @Override public default void doIt(){
    System.out.println("Service_A");
    System.out.println(this.getClass().getSimpleName());
  };

//  @Override void doItDefault();

//  public default void doItStatic(){
//    System.out.println("Service_A = doItStatic");
//  }
  public static void doItStatic(){
    System.out.println("Service_A = doItStatic");
  }

}


