package com.Arrays.Sorting;

//1) Write a Java Program to complete below requirement
//a)Take an integer array with unsorted order 
//b)sort the array using Bubble sort algorithm
import java.util.Arrays;

public class BubbleSort2 {

	public static void main(String[] args) {
   int arr[]= {5,4,6,3,2,1};
   System.out.println("unsorted Array");
   System.out.println(Arrays.toString(arr));
   


   
   for(int i=0;i<arr.length;i++) {
	   System.out.println(arr[i]+" ");
   }
   int temp=0;
   for(int i=0;i<arr.length-1;i++) {
	   
   
   for(int j=0;j<arr.length-1-i;j++) {
	   if(arr[j]>arr[j+1]) {
		    temp=arr[j];
		    arr[j]=arr[j+1];
		    arr[j+1]=temp;
		}
   }		   
   }
   
   System.out.println("sorted Array");
   for(int i=0;i<arr.length;i++) {
	System.out.println(arr[i]+" ");
   
}

	}
}
