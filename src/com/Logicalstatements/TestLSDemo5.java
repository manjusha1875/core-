package com.Logicalstatements;

import java.util.Scanner;

public class TestLSDemo5 {


    public static void main(String[] args) {

        System.out.println("Main method started");
        System.out.println("Welcome to Employee Selection System");

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your full name:");
        String name = sc.nextLine();

        System.out.println("Nice to meet you, " + name);

        System.out.println("Enter your expected monthly salary:");
        double salary = sc.nextDouble();

        if (salary >= 50000) {

            System.out.println("Good! Your salary expectation is acceptable.");

            System.out.println("Enter your age:");
            int age = sc.nextInt();

            if (age >= 21 && age <= 35) {

                System.out.println("Your age matches our requirements.");

                System.out.println("Enter your percentage:");
                double percentage = sc.nextDouble();

                if (percentage >= 60) {

                    System.out.println("Your academic percentage is good.");

                    System.out.println("Enter your years of experience:");
                    int experience = sc.nextInt();

                    if (experience >= 0 && experience <= 5) {

                        System.out.println("Your experience matches our requirements.");

                        System.out.println("Do you have Java knowledge? (true/false)");
                        boolean javaKnowledge = sc.nextBoolean();

                        if (javaKnowledge) {

                            System.out.println("Excellent! You are eligible for the next round.");

                        } else {

                            System.out.println("Please learn Java before attending the interview.");

                        }

                    } else {

                        System.out.println("Your experience does not match our requirements.");

                    }

                } else {

                    System.out.println("You need at least 60% in your academics.");

                }

            } else {

                System.out.println("Sorry! Your age does not match our requirements.");

            }

        } else {

            System.out.println("Your expected salary is below our minimum requirement.");

        }

        sc.close();
    }
}

