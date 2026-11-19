package com.oopsInheritance;

class Human {
	void eat() {
		System.out.println("Human can eat by using hands !!");
	}

	void sleep() {
		System.out.println("human can sleep atleast ");
	}
}

class Employee extends Human {
	@Override
	void sleep() {
		System.out.println("employee ca work 18hrs per day!! and sleep only");
	}

}

class Student extends Human {
	@Override
	void sleep() {
		System.out.println("students can sleep 6 hrs");
		System.out.println("Most students are studios & perparing minimum");
	}

}

public class TestInhDemo2 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		Student s1 = new Student();
		s1.sleep();
		s1.eat();
	}

}
