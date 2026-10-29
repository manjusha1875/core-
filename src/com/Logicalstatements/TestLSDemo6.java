package com.Logicalstatements;

public class TestLSDemo6 {

	public static void main(String[] args) {
       int age =19;
       boolean indiancitizen =true;
       boolean hasvoterid = true;
       
       if(age<0) {
    	   System.out.println("Invalid to vote");
       }if(age<19) {
    	   System.out.println("Not eligible to vote");
       
       }else if(!indiancitizen) {
    	   System.out.println("not eligible");
       }else if(!hasvoterid) {
    	   System.out.println("not eligible to vote");
       }else {
    	   System.out.println("eligible to vote");
    	   
       }
	}

}

