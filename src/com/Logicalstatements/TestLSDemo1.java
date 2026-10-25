package com.Logicalstatements;

import java.util.Scanner;

public class TestLSDemo1 {

	public static void main(String[] args) {
System.out.println("main method started");  

Scanner sc = new Scanner(System.in);
System.out.println("Enter your age :");
int age = sc.nextInt();

if(age >=18) {
	System.out.println("Good Day !!");
	System.out.println("Congrtulations !! You are eligible for Driving & Voting");
}else {
	System.out.println("babu chitti !! niku time vundi");
	System.out.println("thanks !! you");
}
System.out.println("main method ended");
sc.close();
	}

}
