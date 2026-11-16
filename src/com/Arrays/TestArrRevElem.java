package com.Arrays;

//Write a Java Program to create a new array where each element
//is the sum of the previous and next element of the given array.

//Input:  {10,20,30,40,50,60}
//Output: {30,40,60,80,100,110}

public class TestArrRevElem {

	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 40, 50, 60 };

		int[] number = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {

			if (i == 0) {
				number[i] = arr[i] + arr[i + 1];
			} else if (i == arr.length - 1) {
				number[i] = arr[i - 1] + arr[i];
			} else {
				number[i] = arr[i - 1] + arr[i + 1];
			}
		}

		for (int i = 0; i < number.length; i++) {
			System.out.print(number[i] + " ");
		}
	}
}