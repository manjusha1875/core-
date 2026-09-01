package com.javafirstclass;

public class movie {
	
	static String theatrename = "pvr cinema";
	static String theatrelocation = "kbhp";
	
	String moviename;
	double moviebudget;
	String releasedate;

	public static void main(String[] args) {
		movie m1=new movie();
		
		m1.moviename="pushpa";
		m1.moviebudget=500;
		m1.releasedate="15-06-25";
		 
		
		System.out.println("theatrename:"+ theatrename);
		System.out.println("theatrelocation:"+ theatrelocation);
		
		System.out.println("theatre");


	}

}
