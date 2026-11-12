package com.Arrays;
//1.Write a Java program to print Reverse of Element in the Given Array?

//i/p: int arr[]={11,12,13,14,15,16}; 
//o/p:	{11,21,31,41,51,61};

public class TestArrRev {
	public static void main(String[] args) {

		int[] numbers = { 11, 12, 13, 14, 15, 16 };

		for (int i = 0; i <numbers.length; i++) {

			int n = numbers[i];
			int reverse = 0;

			while (n > 0) {
				int rem = n % 10;
				reverse = reverse * 10 + rem;
				n = n / 10;
			}

			System.out.println(reverse);
		}
	}
}
