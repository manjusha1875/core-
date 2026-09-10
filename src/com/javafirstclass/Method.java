package com.javafirstclass;

public class Method {
	void method1() {
	System.out.println("static method1");
	
}
	void method2() {
	System.out.println("static method2");
	}

void method3() {
System.out.println("instance method1");
}

void method4() {
System.out.println("instance method2");

}
void  methods() {
	method1();
	method2();
	method3();
	method4();
}
	public static void main(String[] args) {
		Method  m = new Method();
        m.methods();
	}

}
