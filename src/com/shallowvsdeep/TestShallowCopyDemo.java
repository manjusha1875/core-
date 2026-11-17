package com.shallowvsdeep;
//Shallow copy
class Student implements Cloneable {
	int id;
	String name;

	Address address;

	public Student(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	void StudentInfo() {
		System.out.println("********************");
		System.out.println("Student ID:" + id);
		System.out.println("Student Name:" + name);
		System.out.println("Student Address:" + address.city);

	}
}

class Address {
	String city;

	public Address(String city) {
		super();
		this.city = city;
	}

}

public class TestShallowCopyDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		System.out.println("main method started");
		Address address = new Address("Hyderbad");
		Student s1 = new Student(1, "manju", address);
		s1.StudentInfo();

		Student s2= (Student) s1.clone();
		s2.StudentInfo();
		
		s2.id=2;
		s2.name="Bhavi";
		s2.address.city="Guntur";
		s2.StudentInfo();
		s1.StudentInfo();
		
		System.out.println("main method ended");
	}

}
