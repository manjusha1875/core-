package com.oopsInheritance;

class VehicleManagementSystem {

	int vid;
	String Vname;
	double Vspeed;

	void start() {
		System.out.println(Vname + " is starting");
	}

	void stop() {
		System.out.println(Vname + " is stopping");
	}
}

class Car extends VehicleManagementSystem {

	void openSunroof() {
		System.out.println("Car sunroof is opening");
	}
}

class Bike extends VehicleManagementSystem {

	void doWheelie() {
		System.out.println("Bike is doing wheelie");
	}
}

class Truck extends VehicleManagementSystem {

	void loadCargo() {
		System.out.println("Truck is loading cargo");
	}
}

public class TestVehicle {

	public static void main(String[] args) {

		Car c = new Car();

		c.vid = 101;
		c.Vname = "BMW";
		c.Vspeed = 120;

		System.out.println("Vehicle ID: " + c.vid);
		System.out.println("Vehicle Name: " + c.Vname);
		System.out.println("Vehicle Speed: " + c.Vspeed);

		c.start();
		c.openSunroof();
		c.stop();

		System.out.println("*********************");

		Bike b = new Bike();

		b.vid = 102;
		b.Vname = "Pulsar";
		b.Vspeed = 100;

		System.out.println("Vehicle ID: " + b.vid);
		System.out.println("Vehicle Name: " + b.Vname);
		System.out.println("Vehicle Speed: " + b.Vspeed);

		b.start();
		b.doWheelie();
		b.stop();

		System.out.println("*********************");

		Truck t = new Truck();

		t.vid = 103;
		t.Vname = "Tata";
		t.Vspeed = 80;

		System.out.println("Vehicle ID: " + t.vid);
		System.out.println("Vehicle Name: " + t.Vname);
		System.out.println("Vehicle Speed: " + t.Vspeed);

		t.start();
		t.loadCargo();
		t.stop();
	}
}