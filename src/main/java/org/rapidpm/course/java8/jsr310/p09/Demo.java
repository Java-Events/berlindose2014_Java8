package org.rapidpm.course.java8.jsr310.p09;

public class Demo {

	public Demo() {
		System.out.println("3");
	}

	static {
		System.out.println("1a");
	}

	{
		System.out.println("2a");
	}

	{
		System.out.println("2b");
	}
	
	static {
		System.out.println("1b");
	}
	
	static {
		System.out.println("1c");
	}
	
	{
		System.out.println("2c");
	}

	public static void main(String[] args) {
		final Demo demo = new Demo();
	}
	
}