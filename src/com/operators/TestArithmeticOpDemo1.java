package com.operators;

import java.util.Scanner;

//1)Arithmetic operators : + - / %
public class TestArithmeticOpDemo1 {

	public static void main(String[] args) {
		System.out.println("main Method started");
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a = sc.nextInt();
				
		System.out.println("Enter b number: ");
		int b = sc.nextInt();
			
		//String + Anything is string only,Here we need use
		//BODMAS Formula  sum
		System.out.println("Addition of two numbers: " + (a + b));
		
		//difference
		//10 5 :CE :The operator - is undefined for the argument type(s) String, int
		 System.out.println("Difference of Two Numbers :" +( a-b));
		 
		 //10 5 -->product
		 System.out.println("Multiplication of Two Numbers :" + a *b);
		 
		 //Quotient -->998/5-->
		 System.out.println("Division of Two Numbers :" + a /b);
		 System.out.println("modulus of Two Numbers :" + a %b);


	}

}
