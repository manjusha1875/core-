package com.Arrays;

//WAP to Represent few names in Arrays..?
public class TestArrDemo2 {

	public static void main(String[] args) {
		String[] names = new String[6];// 0 1 2 3 4

		names[0] = "manju";
		names[1] = "bhavi";
		names[2] = "mental";
		names[3] = "menal";
		names[4] = "mntal";
		names[5] = "menal";

		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		// for(String n:names{
		// System.out.println(n);
		// }
	}

}
