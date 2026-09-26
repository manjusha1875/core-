package com.javafirstclass;

public class Human {

String brand;
String colour;
String model;
double price;
int yearofbrith;

Human(){
	brand = "unknown";
	model = "unknown";
	colour = "white";
	price = 20000.00;
	yearofbrith = 2005;
}
	public static void main(String[] args) {

	System.out.println("main method started");
	System.out.println("welcome to human in earth ");
	Human H = new Human();
	H.Humaninfo();
	System.out.println("main method ended");
	}
	void Humaninfo() {
		System.out.println("***********");
		System.out.println("brand of the human:"+brand);
		System.out.println("colour of the human:"+colour);
		System.out.println("model of the human:"+model);
		System.out.println("price of the human:"+price);
		System.out.println("year of the human:"+yearofbrith);

	}

}
	
