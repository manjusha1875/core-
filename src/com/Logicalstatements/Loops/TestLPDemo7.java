package com.Logicalstatements.Loops;

import java.util.Scanner;

//WAP to print factorial of given number using for loop..?
//i/p:4
//o/p:24 
public class TestLPDemo7 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		
		int fact=1;
		
		for(int i=n;i>=1; i--) {
			fact=fact*i;//4X3=12X2=24X1=24
		}
		System.out.println("Factorial of a given number is:"+fact);
	}

}
