package com.javafirstclass;

import java.util.Scanner;

public class TestDemo3 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter students grade");
int marks = sc.nextInt();

if(marks <=0 || marks >=100) {
System.out.println("Enter Invalid Grade");
	}
	else if(marks >=90) {
		System.out.println("Grade A");
	}
	else if(marks >=80) {
		System.out.println("Grade B");
	} 
	else if(marks >=70) {
		System.out.println("Grade C");
	}
	else if(marks >=60) {
		System.out.println("Grade D");
}
	else {
		System.out.println("Fail");
	}
   sc.close();
	}
}
