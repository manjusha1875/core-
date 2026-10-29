package com.Logicalstatements;

import java.util.Scanner;

public class TestLSDemo7 {
  public static void main(String[] args) {
	  	System.out.println("main method started !!");
	  	Scanner sc=new Scanner(System.in);
	  	System.out.println("Enter a Day number :");
	  	int day=sc.nextInt();
	  	
	  	switch(day) {
	  	case 1->
	  	{
	  		System.out.println("Sunday");
	  	    System.out.println("Sunday is a Holiday");

	  	}
	  	
	  	case 2->System.out.println("monday");
	  	case 3->System.out.println("Tuesday");
	  	case 4->System.out.println("wednesday");
	  	case 5->System.out.println("thursday");
	  	case 6->System.out.println("Friday");
	  	case 7->System.out.println("Saturday");
	  	default->System.out.println("Enter day is not valid !");


	  	}
  }
}
