package com.Arrays;

import java.util.Scanner;

//Java-
//1.Write a java program  to rounding of elements in given array
//Eg: arr[]={99,95,71,84,81,75,60}
//Output: {100,90,70,80,80,70,60}

public class TestRounding4 {

	public static void main(String[] args) {

		int arr[] = { 99, 95, 71, 84, 81, 75, 60 };

		for (int i = 0; i < arr.length; i++) {

			arr[i] = (arr[i] / 10) * 10;

			if (arr[i] % 10 != 0) {
				arr[i] = arr[i] + 10;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			Scanner sc=new Scanner(System.in);
			System.out.println(" ");
		}
	}
}
