package com.Logicalstatements;

import java.util.Scanner;


//WAP to  print T shirt Description Based on t-shirt size:
public class TestLSDemo10 {

	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a T shirt size : ");
      
      int t_size =sc.nextInt();
      
      switch(t_size) {
      case 32 ->{
    	  System.out.println("T-shirt size description is X-small");
    	  System.out.println("The T-shirt price is 550rs ");
      }
      
      case 34 ->System.out.println("T-shirt size description is small");
      case 36 ->System.out.println("T-shirt size description is Medium");
      case 38 ->System.out.println("T-shirt size description is Large");
      case 40 ->System.out.println("T-shirt size description is X-Large");
      case 42 ->System.out.println("T-shirt size description is XX-large");
      default ->System.out.println("The T-shirt size is not availble in my shop");

      }
	}

}
