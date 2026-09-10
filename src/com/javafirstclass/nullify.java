package com.javafirstclass;

public class nullify {
  String student=null;
	public static void main(String[] args) {
		nullify obj1= new nullify();
		obj1=null;
		nullify obj2= new nullify();
		obj2=null;

		nullify obj3=new nullify();
		obj3=null;

		System.out.println("welcome to nullify objects");	
		System.out.println("obj1:"+obj1);
		System.out.println("obj2:"+obj2);
		System.out.println("obj3:"+obj3);
		}

}
