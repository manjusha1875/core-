package com.oopsInheritance;

import java.util.Scanner;

class BookStore {
	int Bookid;
	String Bookname;
	String Author;
	int year;

	void display() {
		System.out.println("Book ID: " + Bookid);
		System.out.println("Book Name: " + Bookname);
		System.out.println("Author: " + Author);
		System.out.println("Year: " + year);
	}
}

public class TestMulInher {

	public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        BookStore b = new BookStore();

	        System.out.println("Enter Book ID:");
	        b.Bookid = sc.nextInt();

	        sc.nextLine();

	        System.out.println("Enter Book Name:");
	        b.Bookname = sc.nextLine();

	        System.out.println("Enter Author Name:");
	        b.Author = sc.nextLine();

	        System.out.println("Enter Published Year:");
	        b.year = sc.nextInt();

	        System.out.println("----- Book Details -----");

	        b.display();

	        sc.close();
	    }
}
