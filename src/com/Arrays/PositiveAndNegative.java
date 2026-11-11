package com.Arrays;
//.Write a Java program to count positive and negative elements in an array.
public class PositiveAndNegative {

	public static void main(String[] args) {

		int[] numbers = { 2, 4, -6, 9, -12 };

		int positivec = 0;
		int Negativec = 0;

		for (int i = 0; i < numbers.length; i++) {

			if (numbers[i] % 2 == 0) {
				positivec++;
				System.out.println("positive number is:"+numbers[i]);
				
			} else {
				Negativec++;
				System.out.println("Negative number is:"+numbers[i]);
			}
		}

		System.out.println(positivec);
		System.out.println(Negativec);
	}
}

	
