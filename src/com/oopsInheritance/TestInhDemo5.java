package com.oopsInheritance;

class TestA1{
	TestA1(){
		System.out.println("TestA constructor called");
	}
}
class TestB1{
	TestB1(){
		System.out.println("Testb constructor called ");
	}
}
class TestC1 extends TestB1{
	TestC1(){
		super();
		System.out.println("Testc consturctor calleed");
	}
}
public class TestInhDemo5 {

	public static void main(String[] args) {
System.out.println("main method started");
TestC1 t=new TestC1();
System.out.println("main method ended");
	}

}
