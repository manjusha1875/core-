package com.javafirstclass;

public class test3{
static test3 t=new test3();
void method3() {
	System.out.println("method3 called");
}
void method2() {
	method3();
	System.out.println("method2 called");
		
	}
	
void method1() {
	method2();
	System.out.println("method1 called");
}
	public static void main(String[] args) {
		System.out.println("main method started");
		t.method1();
System.out.println("main method ended");
	}

}
