/*
 *  (c) tolina GmbH, 2014
 */
package org.rapidpm.course.java8.lang.l01.p05;

interface A {

	String foo = "";

	default void doIt() {
		System.out.println("A");
	}
}