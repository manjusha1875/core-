package com.javafirstclass;

public class vehicle {
String type;
vehicle(String type){
	this.type = type;
}
} 

class Car2 extends vehicle{
	String brand;
	int price;
	
Car2(String type,String brand,int price){
	super(type);
	this.brand = brand;
	this.price = price;  
	}
}
 class ElectricCar extends Car2{
	String batteryCapacity;
ElectricCar(String type,String brand,int price, String batteryCapacity){
	super(type,brand,price);
	this.batteryCapacity = batteryCapacity;
}
 
void display() {
	System.out.println("welcome to vehicles car");
	System.out.println("car2 of type:" + type);
	System.out.println("car2 of brand:" + brand);
	System.out.println("car2 of price:" + price);
	System.out.println("car2 of batteryCapacity:" + batteryCapacity);
}

public static void main(String[] args) {
	ElectricCar e = new ElectricCar("Electric",
			"Tesla",
			5000000,
			"100 kwh"
			);
	e.display();
	
	}

}
 
