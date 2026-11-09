
package com.Arrays;

//WAP to print 10 student ages using Array..?
public class TestArrDemo1 {

	public static void main(String[] args) {
		//Declaration 
    int [] ages;
    
    //creation
    ages= new int[10];
    
    //Initialize
    ages[0]=22;
    ages[1]=21;
    ages[2]=20; 
    ages[3]=19;
    ages[4]=17;
    ages[5]=18;
    
    //Representation using for loop
    
    for(int i=0;i<ages.length;i++) {
  	  System.out.println(ages[i]);
    }
    
  //Representation using for each loop
    System.out.println("All student ages");
    for(int age:ages) {
  	  System.out.println(ages);
    }
	}

}

