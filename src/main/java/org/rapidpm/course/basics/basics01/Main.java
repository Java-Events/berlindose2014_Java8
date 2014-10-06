package org.rapidpm.course.basics.basics01;

/**
 * Created by Alexander Bischof on 20.08.2014.
 * <p/>
 * <p/>
 */
public class Main {
  public static void main(String[] args) {

    //Example 1
    String alex = "alex";
    String sven = "sven";
    String alex2 = "alex";

    System.out.println(alex == alex2);
    System.out.println(alex == sven);
    System.out.println(alex.equals(alex2));
    System.out.println("===========");

    //Example 2
    alex2 = new String("alex");

    System.out.println(alex == alex2);
    System.out.println(alex == sven);
    System.out.println(alex.equals(alex2));
    System.out.println("===========");

    //Example 3
    alex2 = new String("alex").intern();

    System.out.println(alex == alex2);
    System.out.println(alex == sven);
    System.out.println(alex.equals(alex2));
    System.out.println("===========");

    //Example 4
    alex2 = String.valueOf("alex");
    System.out.println(alex == alex2);
    System.out.println(alex == sven);
    System.out.println(alex.equals(alex2));
    System.out.println("===========");

    String a = new String("alex");
    String b = new String("alex");
    System.out.println(a == b);
    System.out.println(a == sven);
    System.out.println(a.equals(b));


  }
}
