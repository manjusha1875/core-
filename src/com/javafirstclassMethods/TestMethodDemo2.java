
package com.javafirstclassMethods;

import java.util.Scanner;
//Write a Java program to calculate an employee's salary using user-defined methods
public class TestMethodDemo2 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Main method started");

		double basic = basicSalary();

		double hra = hra(basic);

		double ita = ita();

		double spa = specialallowance();

		double mea = mealAllowed();

		double pf = pf(basic);

		double gt = gratuity(basic);

		double total = basic + hra + ita + spa + mea - pf;

		System.out.println("Basic Salary: " + basic);
		System.out.println("HRA: " + hra);
		System.out.println("ITA: " + ita);
		System.out.println("Special Allowance: " + spa);
		System.out.println("Meal Allowance: " + mea);
		System.out.println("PF: " + pf);
		System.out.println("Gratuity: " + gt);
		System.out.println("Total Salary: " + total);

		System.out.println("Main method ended");
	}

	static double basicSalary() {

		System.out.println("Enter your basic salary:");

		double bs = sc.nextDouble();

		return bs;
	}

	static double hra(double basic) {

		return basic * 0.20;
	}

	static double ita() {

		System.out.println("Enter IT Allowance:");

		return sc.nextDouble();
	}

	static double specialallowance() {

		System.out.println("Enter Special Allowance:");

		return sc.nextDouble();
	}

	static double mealAllowed() {

		System.out.println("Enter Meal Allowance:");

		return sc.nextDouble();
	}

	static double pf(double basic) {

		return basic * 0.12;
	}

	static double gratuity(double basic) {

		return basic * 0.0481;
	}
}


//op:-Main method started
//Enter your basic salary:
//25000
//Enter IT Allowance:
//2000
//Enter Special Allowance:
//3000
//Enter Meal Allowance:
//1000