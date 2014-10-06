package org.rapidpm.course.java8.lambdas.l01;

/**
 * Created by Sven Ruppert on 06.10.2014.
 */
public class Main {

  public static void main(String[] args) {

    Service service = new Service() {
      @Override
      public void run() {
        System.out.println("ServiceImpl run");
      }
    };

    Service serviceA = () -> {
        System.out.println("ServiceImpl run");
    };
    Service serviceB = () -> System.out.println("ServiceImpl run");


   ServiceReturn serviceReturn = new ServiceReturn() {
     @Override
     public String hoppel() {
       return "Naaaase";
     }
   };

   ServiceReturn serviceReturnA = () -> {
       return "Naaaase";
   };
   ServiceReturn serviceReturnB = () -> "Naaaase";

   ServiceArguments serviceArguments = new ServiceArguments() {
     @Override
     public void execute(String a, String b) {
       System.out.println("a = " + a);
       System.out.println("b = " + b);
     }
   };

   ServiceArguments serviceArgumentsA = (a, b) -> {
       System.out.println("a = " + a);
       System.out.println("b = " + b);
   };












  }


}
