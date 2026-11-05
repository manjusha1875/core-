package com.Logicalstatements.Loops;

import java.util.Scanner;
//WAP to print reverse order
//Input: 1234
//Output: 4321

//Remember:
//Perfect Number uses a for loop.
//Reverse Number uses a while loop.
public class WhileLoop1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");

        int n = sc.nextInt();

        int rev = 0;

        while(n > 0) {

            int b = n % 10;

            rev = rev * 10 + b;

            n = n / 10;
        }

        System.out.println("Reverse number is: " + rev);
    }
}
