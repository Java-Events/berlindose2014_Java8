package org.rapidpm.course.java8.lang.l01.p05;

/**
 * Created by Alexander Bischof on 20.08.2014.
 * <p>
 * <p>
 */
public class Main {
	public static void main(final String[] args) {

		//Example 1
		final String alex = new String("alex");
		final String alex2 = new String("alex");

		System.out.println(alex == alex2);
		System.out.println(alex.equals(alex2));
		System.out.println("===========");

	}

}
