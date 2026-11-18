package com.Arrays;

import java.util.Arrays;

public class TestarrDemo6 {

	public static void main(String[] args) {
 
		int[] arr= {1,2,3,1,2};
		int[] result=Arrays.stream(arr).distinct().toArray();
	
		System.out.println(Arrays.toString(result));
	
	}
}
