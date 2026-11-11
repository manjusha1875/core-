package com.Arrays;

//Write a Java program to count even and odd elements in an array.

public class EvenAndOdd {

	public static void main(String[] args) {

		int[] numbers = { 2, 4, 6, 9, 12 };

		int evenc = 0;
		int oddc = 0;

		for (int i = 0; i < numbers.length; i++) {

			if (numbers[i] % 2 == 0) {
				evenc++;
				System.out.println("even number is:"+numbers[i]);
				
			} else {
				oddc++;
				System.out.println("odd number is:"+numbers[i]);
			}
		}

		System.out.println(evenc);
		System.out.println(oddc);
	}
}
