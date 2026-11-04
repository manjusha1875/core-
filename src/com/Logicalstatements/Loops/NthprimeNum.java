package com.Logicalstatements.Loops;

import java.util.Scanner;

public class NthprimeNum {


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
    System.out.println("how many numbers can you print..? ");
    
    int n = sc.nextInt();

    int count = 0;

    for(int i = 2; count <=n; i++) {

        if(isprime(i)) {

            count++;

            if(count == n) {
                System.out.println("Nth Prime Number is : " + i);
            }
	
	}

}
	}
}
