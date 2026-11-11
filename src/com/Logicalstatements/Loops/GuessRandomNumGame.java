//o/p:7

package com.Logicalstatements.Loops;

import java.util.Random;
import java.util.Scanner;

public class GuessRandomNumGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Random r = new Random();

        int n = r.nextInt(10) + 1;

        for (int i = 1; i <= 3; i++) {

            System.out.println("Enter a Random Number (1 to 10):");

            int guess = sc.nextInt();

            if (guess == n) {

                System.out.println("Congratulations! You guessed the correct number.");
                break;

            } else if (guess > n) {

                System.out.println("Too high! Try again.");

            } else {

                System.out.println("Too low! Try again.");
            }

            if (i == 3) {

                System.out.println("Game is over");
                System.out.println("Correct guessing number is: " + n);
            }
        }

        sc.close();
    }
}

