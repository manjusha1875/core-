package com.Arrays;

import java.util.Scanner;

public class ReadelementsScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array Size:");
		int size = sc.nextInt();

		int[] numbers = new int[size];

		System.out.println("ente tyhe elements:");
		for (int i = 0; i < size; i++) {
			numbers[i] = sc.nextInt();
		}
		System.out.println(numbers);
		for(int n:numbers) {
			System.out.println(n+" ");
		}
	}

}
