package com.javafirstclass;

public class count {
 static int count=0;
 count(){
	 count++;
	 
 }
	public static void main(String[] args) {
		count c1 = new count();
		count c2 = new count();
		count c3 = new count();
		count c4 = new count();
		System.out.println("numbers of objects:"+count );

	}

}
