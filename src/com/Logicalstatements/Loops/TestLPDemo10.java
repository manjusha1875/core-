package com.Logicalstatements.Loops;

import java.util.Scanner;

//WAP to print Math table..?
//i/p:9
//o/p:9X1=9
public class TestLPDemo10 {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
         System.out.println("What table do you want to print");
         int n=sc.nextInt();
         System.out.println("How many times you want to print..?");
         int n1=sc.nextInt();
         
         for(int i=1;i<n1;i++) {
        	 System.out.println(n +"X"+ i+"="+(n*i));
         }
         }

}
