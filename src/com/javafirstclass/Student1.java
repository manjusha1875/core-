package com.javafirstclass;

public class Student1 {
 int studentid = 401;
 String stuname = "akhila" ;
 int stusalary = 1500;
 
	void display() {
		System.out.println("student id :"+ studentid);
		System.out.println("stuname :"+ stuname);
		System.out.println("stusalary :"+ stusalary);
	System.out.println();
	}
	
	
	class Student2{
		int studentid;
		 String stuname  ;
		 int stusalary ;
		 
	}
		public void main(String[] args) {
             Student1 s1 = new Student1();
			s1.studentid =101;
			s1.stuname = "manju";
			s1.stusalary=20000;
			
			Student1 s2 = new Student1();
			s2.studentid =102;
			s2.stuname = "anju";
			s2.stusalary=30000;
			
			Student1 s3 = new Student1();
			s3.studentid =103;
			s3.stuname = "bhavi";
			s3.stusalary=40000;
			
			s1.display();
			
			
			s2.display();
			s3.display();
			
			}
		}
	
