/*
 *  (c) tolina GmbH, 2014
 */
package org.rapidpm.course.java8.lang.l01.p05;

interface B extends A {
	@Override
	default void doIt() {
		System.out.println("B");
	}
}