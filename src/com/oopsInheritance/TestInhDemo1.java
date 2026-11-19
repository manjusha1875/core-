package com.oopsInheritance;

class Dog {
	
	void sound() {
		System.out.println("Dogs can sound like Bow Bow !!");
	}
}

//multi-level Inheritance other class
//that another class  extends one more class  and so on will consider as multi-level inheritance
class BabyDog extends Dog {
	@Override
	void sound() {
		System.out.println("Baby Dog can sound uff uff");
	}
}

//Driver class
public class TestInhDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started !!");

		Dog d = new Dog();
		d.sound();

		BabyDog bd = new BabyDog();
		bd.sound();
	}

}
