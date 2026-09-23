package com.javafirstclass;

public class Employee2 {
int eid;
String ename;
double esal;

 Employee2(){
	 System.out.println("no-arg constructor called");
	 eid =1;
	 ename="unknown";
	 esal=10000;
	 
	}
 Employee2(int id, String nm,double sal)
 {
	 eid = 7714;
	 ename ="manju";
	 esal = 20000;
 }
	public static void main(String[] args) {
		System.out.println("main method started");
			
		Employee2 emp1 = new Employee2();
		
	   
		
		Employee2 emp2 = new Employee2();
		
		System.out.println("main method ended");
		
	}

}
