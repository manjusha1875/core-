package com.javafirstclass;

import java.util.Scanner;

public class TestGrade {

	public static void main(String[] args) {
    
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student marks:");
		int  marks = sc.nextInt();
		
		if (marks >= 90 && marks <=100) {
			System.out.println("grade A");
		}
		else if( marks >=80 && marks <=90){
			System.out.println("grade B");
		}
		else if(marks >=70 && marks <=80) {
			System.out.println("grade C");
		}
		else if(marks >=60 && marks <=70) {
			System.out.println("grade D");
		}
		else if(marks >=0 && marks <=60) {
			System.out.println("fail");
		} else {	
			System.out.println("Its invalid marks");	
		}
		sc.close();
		}
	}

