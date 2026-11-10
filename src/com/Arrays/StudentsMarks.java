package com.Arrays;

//WAP to print sum & avg of student Marks..?
//i/p:-99 98 97 96 95 94
//o/p:-sum =579 & avg =96.587576
public class StudentsMarks {

	public static void main(String[] args) {

		int[] marks = { 99, 98, 97, 96, 95, 94 };// 0 1 2 3 4 5
		int sum = 0; // we can write double sum=0;
		int avg = 0; // double avg=0;

		// for(int i=0;i<marks.length;i++) {
		// sum =sum +marks[i];
		// }

		for (int m : marks) {
			sum += m;
		}
		avg = sum / marks.length;
		System.out.println("Sum of all the marks:" + sum);
		System.out.println("Sum of all the marks:" + avg);
	}

}
