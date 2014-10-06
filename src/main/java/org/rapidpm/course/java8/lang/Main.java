package org.rapidpm.course.java8.lang;

/**
 * Created by Sven Ruppert on 06.10.2014.
 */
public class Main {
  public static void main(String[] args) {
    final Service service = new ServiceImpl();
    service.doIt();

    final Service both = new Both();
    both.doIt();


    Service s = new Service(){};
    Service hoppelImpl = new HoppelImpl();

  }
}
