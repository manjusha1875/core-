package com.javafirstclass;

public class car1 {
	
	String brand;
	String colour;
	String model;
	double price;
	int year;

	car1(){
		this("unknown");//calling one arg constructor in on arg!
	}

	//one-arg constructor
	car1(String model){
		System.out.println("one arg constructor");
		this(model,"unkonwn","black",200000.00,2026); // calling two arg constructor one
	}

	//two-arg constructor
	car1(String model,String brand){
		System.out.println("two arg constructor");
		this.model=model;
		this.brand=brand;
	}

	//three-arg constructor
	car1(String model,String brand,String colour){
		System.out.println("three arg constructor"); 
		this.model=model;
		this.brand=brand;
		this.colour=colour;
	}

	//four-arg constructor
	car1(String model,String brand,String colour,double price){
		System.out.println("four arg constructor");
		this.model=model;
		this.brand=brand;
		this.colour=colour;
		this.price=price;
	}

	//five-arg constructor
	car1(String model,String brand,String colour,double price,int year){
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
		
	car1 c = new car1();
		c.car1info();
		
//		car1 c1 = new car1("sonet");
		//c1.car1info();
		
		//car1 c2 = new car1("sonet","kia");
		//c2.car1info();
		

		//car1 c3 = new car1("sonet","kia","white");
	//	c3.car1info();
		

		//car1 c4 = new car1("sonet","kia","white",20000.000,2005);
		//c4.car1info();
		
//		car1 c5 = new car1("net","ka","black",120000.000,2008);
	//	c5.car1info();
		
		System.out.println("main method ended");
		}
		void  car1info() {
			System.out.println("***********");
			System.out.println("brand of the car:"+brand);
			System.out.println("colour of the car:"+colour);
			System.out.println("model of the car:"+model);
			System.out.println("price of the car:"+price);
			System.out.println("year of the car:"+year);

		

		}

		}



