package com.oopsInheritance;

class Vehicle{
	
	void hello() {
        System.out.println("Hello from Vehicle");

		
	}
}
class Person{
	void hello() {
		 System.out.println("Hello from Person");
	}
	
}
//why java Does not support multiple Inheritance..?
//Due


//multiple inheritance is not possible with Classes,
//If we try to extend multiple classes will get CE.
//CE:Syntax error on token ",", . expected
//object if we parent classes method which class method will execute is the ambiguity.
//class Car extends Vehicle,Person{
	//Car c=new Car();
//	c.hello();
//	}
public class TestInhDemo4 {

	public static void main(String[] args) {
		System.out.println("main method started !!");
        
	}

}
