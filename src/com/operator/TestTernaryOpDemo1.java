package com.operator;

//Ternary Operator--> ? and :
//it isworking lie a if else conditions
public class TestTernaryOpDemo1 {

	public static void main(String[] args) {

		
		int x = 10;
		int y = 100;
		
		int max =(x>y)?x:y;
		System.out.println("max value from two numbers : "+ max);
		
		int age =21;
		String isEligible =(age>18)?"yes":"no";
		System.out.println("The given age is eligible for Driving..?"+ isEligible);
		
		int a=10;
		int b=20;
		int c=30;
		
		int max1 = (a>b)
				    ?((a>c)?a:c)
				    :(b>c)?b:c;
		System.out.println("max value is:" +max1);
		
	}

}
