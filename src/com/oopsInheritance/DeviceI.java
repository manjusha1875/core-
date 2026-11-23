
package com.oopsInheritance;

class DeviceI {

	private String brand;
	private double price;

	void setBrand(String brand) {
		this.brand = brand;
	}

	void setPrice(double price) {
		this.price = price;
	}
	String getBrand() {
	    return brand;
	}

	double getPrice() {
	    return price;
	}

	void displayDetails() {
		    System.out.println("Brand: " + brand);
		    System.out.println("Price: " + price);
		}
	}

