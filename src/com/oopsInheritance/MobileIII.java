package com.oopsInheritance;

public class MobileIII extends DeviceI {
	String camera;
	String battery;

	void makeCall() {
		System.out.println("Mobile is making a call");
	}

	void takephoto() {
		System.out.println("Mobile is taking a photo");
	}

	@Override
	void displayDetails() {

		System.out.println("Brand: " + getBrand());
		System.out.println("Price: " + getPrice());
		System.out.println("Camera: " + camera);
		System.out.println("Battery: " + battery);

	}
}
