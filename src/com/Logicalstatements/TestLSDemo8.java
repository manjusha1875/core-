package com.Logicalstatements;

import java.util.Scanner;

//Cannot switch on a value of type double. 
//Only convertible int values, strings or enum variables are permitted
public class TestLSDemo8 {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);

System.out.println("Enter a Day :");
String day =sc.next();

switch(day) {
	case "Monday" ->System.out.println("Lazy day to work !!");
	
  	case "Tuesday","wednesday","Thursday"->{
  	System.out.println("Normal days to work !!");
  	System.out.println("Routine Days !!");
}
  	case "Friday"->System.out.println("weekend mode Started");
  	case "Satursday"->System.out.println("weekend,funday enjoy day");
  	case "sunday"->System.out.println("weekend !!");
  	default ->System.out.println("Invalid day enterd,please check");



}
	}

}
