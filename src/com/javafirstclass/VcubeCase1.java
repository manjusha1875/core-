package com.javafirstclass;
class Device {

    private String brand;
    private double price;

    // Setters
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Getters
    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    // Display Details
    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
    }
}

// Child Class 1
class Laptop extends Device {

    int ram;
    String processor;

    void runOS() {
        System.out.println("Laptop Operating System is Running");
    }

    void compileCode() {
        System.out.println("Laptop is Compiling Code");
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("RAM: " + ram + " GB");
        System.out.println("Processor: " + processor);
    }
}

// Child Class 2
class Mobile extends Device {

    String camera;
    int battery;

    void makeCall() {
        System.out.println("Mobile is Making a Call");
    }

    void takePhoto() {
        System.out.println("Mobile is Taking a Photo");
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Camera: " + camera);
        System.out.println("Battery: " + battery + " mAh");
    }
}

// Main Class
public class  VcubeCase1  {

    public static void main(String[] args) {

        // Laptop Object
        Laptop l = new Laptop();

        l.setBrand("Dell");
        l.setPrice(55000);
        l.ram = 16;
        l.processor = "Intel i5";

        // Mobile Object
        Mobile m = new Mobile();

        m.setBrand("Samsung");
        m.setPrice(25000);
        m.camera = "50 MP";
        m.battery = 5000;

        // Runtime Polymorphism
        Device d;

        d = l;
        System.out.println("----- LAPTOP DETAILS -----");
        d.displayDetails();

        l.runOS();
        l.compileCode();

        System.out.println();

        d = m;
        System.out.println("----- MOBILE DETAILS -----");
        d.displayDetails();

        m.makeCall();
        m.takePhoto();
    }
}