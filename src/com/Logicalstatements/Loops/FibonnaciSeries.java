package com.Logicalstatements.Loops;

import java.util.Scanner;

public class FibonnaciSeries {

	public static void main(String[] args) {
		
		
			 System.out.println("main method started"); 
		     Scanner sc=new Scanner(System.in);
		     System.out.println("Enter a Number");
		     int n=sc.nextInt();
		     
		     int a=0;
		     int b=1;
		     
		     
		     
		     for(int i = 1; i<= n; i++) {
		    	 
		    	 System.out.println(a+" ");//1
		    	 int c=a+b;//0+1=1
		    	 a=b;
		    	 b=c;
		     }
		     
			}
		

	}//o\p:enter a number :10


