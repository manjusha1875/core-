//Input: 6 → Perfect Number
//Input: 10 → Not a Perfect Number
//Input: 28 → Perfect Number


package com.Logicalstatements.Loops;

import java.util.Scanner;

public class PerfectNumber {


static void isperfect(int n) {

    int sum = 0;

    for(int i = 1; i < n; i++) {

        if(n % i == 0) {
            sum = sum + i;
        }
    }

    if(sum == n) {
        System.out.println("Perfect Number");
    }
    else {
        System.out.println("Not a Perfect Number");
    }
}

public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a number");
    int n = sc.nextInt();

    isperfect(n);
}


}
