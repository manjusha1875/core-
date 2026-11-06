package com.Logicalstatements.Loops;

import java.util.Scanner;

public class MagicNumber {

	public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a number");
   int n=sc.nextInt();
   int sum=0;
   
   while(n>0) {
	   int r=n%10;
	   sum=sum+r;
	   n=n/10;
   }
	   while(n>9) {
		   
		  sum=0;
	  
       }n=sum;
   if(sum==1) {
	   System.out.println(" Magic Number");
   }else {
	System.out.println("Not Magic number");
   }
	}

}
