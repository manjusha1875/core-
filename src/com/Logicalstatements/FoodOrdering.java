package com.Logicalstatements;

import java.util.Scanner;

public class FoodOrdering {

	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      
      int choice,quantity,price=0,total;
      String item="";
      System.out.println("Enter the which Food you want");
      
      System.out.println("1.pizza 200rs");
      
      System.out.println("2.Burger 120rs");
      System.out.println("3.Briyani 180rs");
      System.out.println("4.Noodles 200rs");
      System.out.println("Enter choice items:");
      
	
	choice = sc.nextInt();

      switch (choice) {
      case 1:
    	  price=200;
    	  break;
      
      case 2:
    	  price=120;
    	  break;
      case 3:
      }
	}

}
