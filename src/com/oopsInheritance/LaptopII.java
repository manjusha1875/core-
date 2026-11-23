package com.oopsInheritance;

public class LaptopII extends DeviceI {
	String ram;
	String processor;

	void RunIDE() {
		System.out.println("Laptop is running IDE");
	}

	void compilecode() {
		System.out.println("Laptop is compiling code");
	}

	@Override
	void displayDetails() {

	    System.out.println("Brand: " + getBrand());
	    System.out.println("Price: " + getPrice());
	    System.out.println("RAM: " + ram);
	    System.out.println("Processor: " + processor);

	}
}
