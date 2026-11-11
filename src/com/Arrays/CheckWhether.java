package com.Arrays;

import java.util.Scanner;

//WAP to check Whether the given elements is available from an array..?
public class CheckWhether {

	public static void main(String[] args) {

		int[]numbers= {1,-2,4,5,6,-9,8,7,-11,15};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter element to search: ");
		int Key=sc.nextInt();
		
		boolean status=false;
		
		for(int n:numbers) {
			if(n==Key) {
				status=true;
				System.out.println("The given elment found:");
				break;
				
			}
		}
		if(!status) {
			System.out.println("the given element is not found:");
		}
	}

}
