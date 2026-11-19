package com.Arrays;

//Write a java program to find frequent count of elements in given array arr={1,2,1,3,1,2,3,4,5,6,1,4,2}
//op:-1->4,2->3
public class FrequentCount {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 1, 3, 1, 2, 3, 4, 5, 6, 1, 4, 2 };

		for (int i = 0; i < arr.length; i++) {

			int count = 1;

			if (arr[i] == -1) {
				continue;
			}

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j]) {
					count++;
					arr[j] = -1;
				}
			}

			System.out.println(arr[i] + " -> " + count);
		}
	}
}
