
package com.Logicalstatements.Loops;

import java.util.Scanner;

public class EvenOddwithrecuri {


static void evenodd(int n) {

    if(n == 0) {
        System.out.println("Even Number");
    }
    else if(n == 1) {
        System.out.println("Odd Number");
    }
    else {
        evenodd(n - 2);
    }
}

public static void main(String[] args) {

    System.out.println("Enter a Number");

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    evenodd(n);
}


}

