package com.Arrays;
//it can removing duplicate value
public class TestarrDemo4 {

	public static void main(String[] args) {

		int []arr= {1,2,3,4,2,1,3,5,6};
		
		for(int i=0;i<arr.length;i++) {
			boolean duplicate=false;
			
			for(int j=0;j<i;j++) {
				if(arr[i]==arr[j]) {
					duplicate=true;
					break;
					
				}
			}
			if(!duplicate) {
				System.out.println(arr[i] +" ");
			}
		}
	}

}
