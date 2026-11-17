package com.oopsInheritance;

class Vehicle {

    int Speed = 50;

    void display() {
        System.out.println("Vehicle Speed: " + Speed);
    }
}

public class Car extends Vehicle {

    int Speed = 100;

    @Override
    void display() {
        System.out.println("Car Speed: " + Speed);
    }

    public static void main(String[] args) {

        Vehicle v = new Car();

        System.out.println(v.Speed);

        v.display();
    }
}