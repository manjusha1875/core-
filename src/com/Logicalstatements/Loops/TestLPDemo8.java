package com.Logicalstatements.Loops;

import java.util.Scanner;
//WAP to print factorial of given number using recursion
public class TestLPDemo8 {

	public static void main(String[] args) {
     System.out.println("main method started"); 
     System.out.println("Enter a number");
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     
     int f = fact(n);
     System.out.println("Factorial of a given number is:"+f);
     
     System.out.println("main method ended");
	}
  static int fact(int n) {
	  
	  if(n==0 || n==1) {
		  return 1;
	  }
  return n*(fact(n-1));
  }
}
