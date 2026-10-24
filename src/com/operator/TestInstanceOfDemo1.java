package com.operator;

public class TestInstanceOfDemo1 {

	public static void main(String[] args) {

		Integer i1=10;
		
		System.out.println(i1 instanceof Integer);
		System.out.println(i1 instanceof Number);
		System.out.println(i1 instanceof Object);
		
		Object obj = 100;
		System.out.println(i1 instanceof Number);
		String s = "One";
		
}

}
