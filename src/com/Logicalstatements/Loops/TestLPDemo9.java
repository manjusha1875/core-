package com.Logicalstatements.Loops;

import java.util.Scanner;

//WAP to print Fibonacci series based on your requireAments
//10 values in fabbonacci series
//0 1 1 2 3 5 8 13 21 34
public class TestLPDemo9 {
	public static void main(String[] args) {
	 System.out.println("main method started"); 
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a how many values number to print..?");
     int n=sc.nextInt();
     
     int n1=0;
     int n2=1;
     
     System.out.println(n1 + " " + n2);
     
     for(int i = 1; 1 <= n; i++) {
    	 int n3 = n1 + n2;//0+1=1
    	 System.out.println(" " + n3);//1
    	 n1=n2;
    	 n2=n3;
     }
     
	}
}
