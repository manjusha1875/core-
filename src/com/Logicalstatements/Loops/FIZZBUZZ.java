package com.Logicalstatements.Loops;

import java.util.Scanner;

public class FIZZBUZZ {

	public static void main(String[] args) {
    System.out.println("main method started");
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number:");
     int n=sc.nextInt();
   //  System.out.println("Enter a how many number to print..");
   //  int n1=sc.nextInt();
     
   //  for(int i=0;i<=10;i++) {
    	 if(n%2==0 && n%3==0) {
    	System.out.println("FIZZBUZZ");
     }else if(n%2==0) {
    System.out.println("BUZZ");
	}
     else if(n%3==0) {
    	 System.out.println("FIZZ");
     }else {
    	 
    	 System.out.println("Enter invalid number");
     }
	}
	
	}
	

