package org.rapidpm.course.java8.lang.l01;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sven Ruppert on 06.10.2014.
 */
public interface Service {
  public void doIt();
  public default void doItDefault(){
    doItStatic();
    doIt();
  };
  public static final String HUHU = "huhu";
  public static void doItStatic(){
    System.out.println("Service = doItStatic");
  }

  public List<String> stringListe = new ArrayList<>();
  public static List<String> stringListeStatic  = new ArrayList<>();

}
