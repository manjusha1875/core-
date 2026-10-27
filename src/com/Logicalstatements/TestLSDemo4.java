package com.Logicalstatements;

import java.util.Scanner;

public class TestLSDemo4 {
      
	public static void main(String[] args) {
		System.out.println("main method started");
		System.out.println("Welcome to  Matrimonial site");
		Scanner sc =new Scanner(System.in);
		
		System.out.println("can you enter your full name :");
		String name = sc.nextLine();
		System.out.println("Nice to meet you mr. "+ name);
		
		System.out.println("Enter your assets : ");
		double assets = sc.nextDouble();
		
		if(assets >=50000000.00) {
			System.out.println("Oh nice to hear lets continue !!");
			
			System.out.println("Enter your salary !!");
			double salary = sc.nextDouble();
			
			if(salary >=250000.00) {
				System.out.println("Okay Good to go !! lets continue the discussion ");
				
				System.out.println("Enter your age :");
				int age =sc.nextInt(); 
				
				if(age >=25 && age <= 29) {
					System.out.println("Oh nice !! good to go");
					
					System.out.println("Enter your Height & weight !!");
					float height =sc.nextFloat();
					double weight =sc.nextDouble();
					
					if((height >=5.4 && height <=6.1) && (weight >=60 && weight<=80)){
					System.out.println("Almost we are good to proceed !!");
					
						System.out.println("Do you have siblings .?");
						boolean sibStatus =sc.nextBoolean();
						
						if(!sibStatus) {
							System.out.println("Thank god !!");
						}else {
							System.out.println("Oh my god");
						}
						
					}else {
						System.out.println("You must need to join gym !!");
                  }
					
				}else {
					System.out.println("Sorry !! your age is not matching with our profile!!");
				}
			}else {
				System.out.println("First concentrate on your carrer...");
			}
			
		}else {
			System.out.println("Sorry your profile is not matching with our expectations !!");
		}
	}
}
