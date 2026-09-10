package com.javafirstclass;

public class test2 {
static {
	System.out.println("static block1 called");
}

static test2 t1=new test2();
{
	System.out.println("instance block1 called");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method started");
		System.out.println("main method ended");
	}
}