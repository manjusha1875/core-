package com.oopsInheritance;

import java.util.Scanner;

public class TestMulinher2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		BookStore[] books = new BookStore[2];

		int count = 0;

		while (true) {

			System.out.println("===== BOOK STORE MANAGEMENT =====");
			System.out.println("1. Insert Book");
			System.out.println("2. View Books");
			System.out.println("3. Update Book");
			System.out.println("4. Delete Book");
			System.out.println("5. Exit");

			System.out.println("Enter Your Choice:");
			int choice = sc.nextInt();

			switch (choice) {

			case 1:
				if (count < 2) {

					books[count] = new BookStore();

					System.out.println("Enter Book ID:");
					books[count].Bookid = sc.nextInt();
					sc.nextLine();

					System.out.println("Enter Book Name:");
					books[count].Bookname = sc.nextLine();

					System.out.println("Enter Author:");
					books[count].Author = sc.nextLine();

					System.out.println("Enter Year:");
					books[count].year = sc.nextInt();

					count++;

					System.out.println("Book Inserted Successfully!");

				} else {
					System.out.println("Book Storage is Full!");
				}
				break;

			case 2:
				if (count == 0) {
					System.out.println("No Books Available!");
				} else {
					for (int i = 0; i < count; i++) {
						System.out.println("\nBook Details:");
						books[i].display();
					}
				}
				break;

			case 3:
				System.out.println("Enter Book ID to Update:");
				int updateId = sc.nextInt();
				sc.nextLine();

				boolean updated = false;

				for (int i = 0; i < count; i++) {

					if (books[i].Bookid == updateId) {

						System.out.println("Enter New Book Name:");
						books[i].Bookname = sc.nextLine();

						System.out.println("Enter New Author:");
						books[i].Author = sc.nextLine();

						System.out.println("Enter New Year:");
						books[i].year = sc.nextInt();

						updated = true;

						System.out.println("Book Updated Successfully!");
						break;
					}
				}

				if (!updated) {
					System.out.println("Book Not Found!");
				}
				break;

			case 4:
				System.out.println("Enter Book ID to Delete:");
				int deleteId = sc.nextInt();

				boolean deleted = false;

				for (int i = 0; i < count; i++) {

					if (books[i].Bookid == deleteId) {

						for (int j = i; j < count - 1; j++) {
							books[j] = books[j + 1];
						}

						books[count - 1] = null;
						count--;

						deleted = true;

						System.out.println("Book Deleted Successfully!");
						break;
					}
				}

				if (!deleted) {
					System.out.println("Book Not Found!");
				}
				break;

			case 5:
				System.out.println("Thank You! Book Store Closed.");
				sc.close();
				return;

			default:
				System.out.println("Invalid Choice!");
			}
		}
	}
}
