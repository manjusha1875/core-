package com.javafirstclass;

import java.util.Scanner;

public class TestAges {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = sc.nextInt();

        String result = (age >= 0 && age <= 4) ? "Kids"
                      : (age >= 5 && age <= 12) ? "Children"
                      : (age >= 13 && age <= 21) ? "Adults"
                      : (age >= 22 && age <= 30) ? "Youngs"
                      : (age >= 31 && age <= 40) ? "Fathers"
                      : (age >= 41 && age <= 60) ? "Older"
                      : "Invalid age";

        System.out.println("Age category is: " + result);

        sc.close();
    }
}



