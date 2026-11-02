package com.Logicalstatements.Loops;

import java.util.Scanner;
//WAP to find the given is perfect or not..?
//perfect number is :sum of the factors is equals to the given number excluding itself
//ex:input:6-->factors:1 2 3 =1+2+3=6
//ex:28-->factors:1 2 4 7 14=28
//output:true
public class TestLPDemo5 {

	public static void main(String [] args) {
		System.out.println("main method started ");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		int n=sc.nextInt();
		
		//calling the method
		boolean status=isperfect(n);
		
		if(status) {
			System.out.println("The given number is perfect :");
		}else {
			System.out.println("The given number is not perfect ");
		}
			
		System.out.println("main method ended");
	}
	
	static boolean isperfect(int n){
		boolean status = false;
		
		int sum=0;
		
		for(int i =1; i<=n/2;i++) {
			if(n % i == 0) {
				sum=sum +i;
			}
			
		}
		if(sum ==n) {
			status =true;
		}
		return status;
	}


	}

