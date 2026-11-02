package com.Logicalstatements.Loops;

import java.util.Scanner;
//A factor is a number that divides another number exactly with zero
//WAP to print factors/Divisors of given number..?
//input:6
//output:1 2 3 
public class TestLPDemo4 {

	public static void main(String[] args) {
System.out.println("main method started ");
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number :");
int n=sc.nextInt();
//calling the method
findFactors(n);

System.out.println("main method ended ");
	}
	static void findFactors(int n) {
		for(int i=1; i<=n/2; i++) {
	     if(n % i==0) {
		   System.out.println(i);
	}
}
}
}