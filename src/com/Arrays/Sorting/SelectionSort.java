package com.Arrays.Sorting;

import java.util.Arrays;

public class SelectionSort {

	
	public static void main(String[] args) {
		int arr[]= {9,4,7,2,5,3,1,6,8};
		int temp=0;
		System.out.println("Before Sorting:"+Arrays.toString(arr));
		for(int i=0;i<arr.length -1;i++) {
			int minIndex =i;//0 ->0,1,3,6
			
			for(int j=i+1;j<arr.length -1;j++) {
				if(arr[j]< arr [minIndex]) {
					minIndex=j;
				}
			
			}
			temp=arr[i];
			arr[i]=arr[minIndex];
			arr[minIndex]=temp;
			
		}
	}

}
