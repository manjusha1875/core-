package com.Logicalstatements.Loops;

import java.math.MathContext;
import java.util.Scanner;

public class PrimeNum1 {

	 static boolean isprime(int n) {
	    	boolean status=true;
	    	
	    	if(n == 0 ||n==1) {
	    	return  false;
	    	
	    	}
	    	
	    	for(int i=2;i <= Math.sqrt(n);i++) {
	    		if(n%i==0) {
	    		status=false;
	    		break;
	    	}
	    }  
	    return status;
	    }
	
	public static void main(String[] args) {
      System.out.println("main method started");
      Scanner sc=new Scanner(System.in);
      System.out.println(Math.sqrt(4));
      System.out.println("How many number can you print..?");
      int n=sc.nextInt();
      System.out.println("Invalid number can give");
      
    for(int i = 1; i <= n; i++) {
	    if(isprime(i)) {
	        System.out.println(i);
	    }
	}

}
	}

