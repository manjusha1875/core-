package com.Arrays;

import java.util.Scanner;

//distinct SecondLargest elements..
public class SecondLargest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a numb");
		int n = sc.nextInt();
		int a[] = { 7, 5, 8, 26, 26, 13 };

		int max = 0;

		for (int i = 0; i < a.length; i++) {

			if (a[i] > max) {
				max = a[i];
			}
		}

		System.out.println("First Largest Element: " + max);

		int max1 = 0;

		for (int i = 0; i < a.length; i++) {

			if (a[i] > max1 && a[i] != max) {
				max1 = a[i];
			}
		}

		System.out.println("Second Largest Element: " + max1);

		sc.close();
	}
}
