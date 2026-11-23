//package com.Arrays;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
////int [] arr{1,2,3,4,5,6,7,8};
//public class TestArrDemo8 {
//
//	public static void main(String[] args) {
//		System.out.println("main method started");
//		Scanner sc=new Scanner(System.in);
//		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
//	
//		
//		rotationalArray(arr,r);
//		System.out.println("after reverse:"+Arrays.toString(arr));
//
//	}
//	
//	static void rationalArray() {
//		int start=0;//0
//		int end=arr.length -1;//7
//		
//		reverseArray(arr,start,end);
//	}
// static void reverseArray(int[] arr,int start,int end) {
//	 int temp=0;//0<7-->8 2 3 4 5 6 7 1
//	 //1<6-->8 7 3 4 5 6 2 1
//	 //2<5-->8 7 6 4  3 2 1
//	 //3<4-->8 7 6 5 4 3 2 1
//	 //4<3-->false
//	 while(start <end) {
//		 temp=arr[start];
//		 arr[start]=arr[end];
//		 arr[end]=temp;
//	 }
// }
//}

package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TestArrDemo8 {

    public static void main(String[] args) {

        System.out.println("main method started");

        Scanner sc = new Scanner(System.in);

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};

        System.out.println("Enter rotation value:");
        int r = sc.nextInt();

        rotationalArray(arr, r);

        System.out.println("after reverse: " + Arrays.toString(arr));

        sc.close();
    }

    static void rotationalArray(int[] arr, int r) {

        r = r % arr.length;

        reverseArray(arr, 0, arr.length - 1);

        reverseArray(arr, 0, r - 1);

        reverseArray(arr, r, arr.length - 1);
    }

    static void reverseArray(int[] arr, int start, int end) {

        int temp = 0;

        while (start < end) {

            temp = arr[start];

            arr[start] = arr[end];

            arr[end] = temp;

            start++;
            end--;
        }
    }
}
