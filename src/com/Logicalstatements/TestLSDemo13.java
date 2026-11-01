package com.Logicalstatements;

import java.util.Scanner;

//switch case-yield
public class TestLSDemo13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your marks :");
		int marks = sc.nextInt();
		
		String grade =switch(marks/ 10) {
		case 10, 9->{
			System.out.println("Marks kosame puttina janalu !!");
			yield"A";
			
		}
		case 8 -> "B";
		case 7-> "c";
		case 6,5,4->"D";
		case 3,2,1,0-> "F";
		default ->"Invalid";
		};
		System.out.println("Grade of the student based on the marks:"+grade);
	}
	
}
