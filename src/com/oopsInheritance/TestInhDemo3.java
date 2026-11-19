package com.oopsInheritance;

interface Book {

	void javaInfo();

}

class J2se implements Book {
	@Override
	public void javaInfo() {
		System.out.println("java is simple");

	}

	void java8Info() {
		System.out.println("java 8 is more simple !!");
	}
}

//A class extends a class and also implements a interface will consider as Hybrid Inheritance.
//A combination of multi-level & Hierarchical Inheritance
class J2EE extends J2se implements Book {

}

public class TestInhDemo3 {

	public static void main(String[] args) {
		System.out.println("main method started !!");
		 J2se j = new J2se();
	        j.javaInfo();
	        j.java8Info();

	        J2EE j2 = new J2EE();
	        j2.javaInfo();
	        j2.java8Info();

	}

}
