package com.Arrays;

import java.util.Arrays;

//Time complexity: O(n Log n)
//space complexity:0(n)
public class TestArrDemo7 {

	public static void main(String[] args) {
		System.out.println("mainmethod started ");

		int[] arr = { 4, 3, 2, 1 };
		divide(arr);
		System.out.println("after sorting:" + Arrays.toString(arr));

		System.out.println("main method ended");
	}

	static void divide(int[] arr) {
		if (arr.length == 1) {
			return;
		}
		int[] left = new int[arr.length / 2];// 0 1-->4 & 3
		int[] right = new int[arr.length - left.length];//0 1-->2 & 1

		int i;// 0,1,2,3

		for (i = 0; i < left.length; i++) {
			left[i] = arr[i];
		}
		for (int j = 0; j < right.length; j++) {
			right[j] = arr[i++];

		}
		divide(left);
		System.out.println("LEFT :" + Arrays.toString(left));

		divide(right);
		System.out.println("right :" + Arrays.toString(right));

		// 4&3-->4is left 3is right
		merge(left, right, arr);
	}

	static void merge(int[] l, int[] r, int[] arr) {
		int i = 0;
		int j = 0;
		int k = 0;

		while (i < l.length && j < r.length) {
			if (l[i] < r[j]) {
				arr[k++] = l[i++];
			} else {
				arr[k++] = r[j++];
			}
		}

		while (i < l.length) {
			arr[k++] = l[i++];
		}

		while (j < r.length) {
			arr[k++] = r[j++];
		}

	}

}
