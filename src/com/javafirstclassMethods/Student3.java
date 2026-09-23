package com.javafirstclassMethods;

public class Student3 {
int id;
String name;
double salary;


Student3(int id, String name, double salary){
	this.id=id;
	this.name = name;
	this.salary= salary;


}
void display() {
	System.out.println("Student id:"+id);
	System.out.println("Student name:"+name);
	System.out.println("Student salary:"+salary);

}
	public static void main(String[] args) {
		Student3 s1 = new Student3(7714,"manju",20000);
		s1.display();
		
		
		Student3 s2 = new Student3(7724,"anju",30000);
		s2.display();
		

	}

}
