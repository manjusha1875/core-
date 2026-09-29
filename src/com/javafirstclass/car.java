package com.javafirstclass;

public class car {
String brand;
String colour;
String model;
double price;
int year;

car(){
	brand = "UNK";
	model = "ASD";
	colour = "white";
	price = 20000.00;
	year = 2020;
}
//one-arg constructor
car(String model){
	System.out.println("one arg constructor");
	this.model=model;
}

//two-arg constructor
car(String model,String brand){
	System.out.println("two arg constructor");
	this.model=model;
	this.brand=brand;
}

//three-arg constructor
car(String model,String brand,String colour){
	System.out.println("three arg constructor"); 
	this.model=model;
	this.brand=brand;
	this.colour=colour;
}

//four-arg constructor
car(String model,String brand,String colour,double price){
	System.out.println("four arg constructor");
	this.model=model;
	this.brand=brand;
	this.colour=colour;
	this.price=price;
}

//five-arg constructor
car(String model,String brand,String colour,double price,int year){
	System.out.println("five arg constructor");
	this.model=model;
	this.brand=brand;
	this.colour=colour;
	this.price=price;
	this.year=year;
}
	public static void main(String[] args) {
	System.out.println("main method started");
	System.out.println("welcome to cars company"); 
	
	car c = new car();
	c.carinfo();
	
	car c1 = new car("sonet");
	c1.carinfo();
	
	car c2 = new car("sonet","kia");
	c2.carinfo();
	

	car c3 = new car("sonet","kia","white");
	c3.carinfo();
	

	car c4 = new car("sonet","kia","white",20000.000,2005);
	c4.carinfo();
	
	car c5 = new car("net","ka","black",120000.000,2008);
	c5.carinfo();
	
	System.out.println("main method ended");
	}
	void  carinfo() {
		System.out.println("***********");
		System.out.println("brand of the car:"+brand);
		System.out.println("colour of the car:"+colour);
		System.out.println("model of the car:"+model);
		System.out.println("price of the car:"+price);
		System.out.println("year of the car:"+year);

	

	}

	}



