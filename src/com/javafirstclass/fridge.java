package com.javafirstclass;

public class fridge {
String brand;
String colour;
String model;
double price;
int year;



	public static void main(String[] args) {
	System.out.println("main method started");
	System.out.println("welcome to fridge company");
	fridge f = new fridge();
	f.fridgeinfo();
	System.out.println("main method ended");
	}
	void fridgeinfo() {
		System.out.println("***********");
		System.out.println("brand of the fridge:"+brand);
		System.out.println("colour of the fridge:"+colour);
		System.out.println("model of the fridge:"+model);
		System.out.println("price of the fridge:"+price);
		System.out.println("year of the fridge:"+year);

	}

}
