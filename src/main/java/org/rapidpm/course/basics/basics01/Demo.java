package org.rapidpm.course.basics.basics01;

/**
 * Created by Sven Ruppert on 06.10.2014.
 */
public class Demo {

  public Demo() {
    System.out.println("A");
  }


  static {
    System.out.println("B1");
  }
  static {
    System.out.println("B2");
  }

  {
    System.out.println("C2");
  }

  {
    System.out.println("C1");
  }



  public static void main(String[] args) {
    final Demo demo = new Demo();

  }


}
