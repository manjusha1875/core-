package com.javafirstclass;

public class student {
 String name = "anju";
 int age = 21;
 String college = "st.mary's college";
	void display() {
		System.out.println("name:"+name);
		System.out.println("age :"+age);
		System.out.println("college :"+college);
	}
	public static void main(String[] args) {
	 student s=new student();
	 s.display();
		
	}
}
