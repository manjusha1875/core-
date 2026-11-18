package com.Arrays;

import java.util.HashSet;
import java.util.Set;

public class TestarrDemo5 {

	public static void main(String[] args) {
int []arr= {1,2,3,1,2};
		Set<Integer> s=new HashSet<>();
		
		for(int a:arr) {
			s.add(a);
			
		}
		System.out.println(s);
	}

}
