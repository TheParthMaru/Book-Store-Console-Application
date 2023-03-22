package com.bookstore.view;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.bookstore.controller.AdminController;

public class AdminView {
	public static void adminLogin() {
		Scanner scan = new Scanner(System.in);
		System.out.println("\n***ADMIN LOGIN***");

		while (true) {
			try {
				System.out.print("Enter username: ");
				String username = scan.nextLine();

				System.out.print("Enter password: ");
				String password = scan.nextLine();

				System.out.println("Do you want to continue? y/n");
				String answer = scan.nextLine();

				if (answer.toLowerCase().equals("y")) {
					AdminController adminController = new AdminController();
					boolean result = adminController.adminLogin(username, password);

					if (result) {
						System.out.println("Logged in as Admin");
						adminMenu();
						break;
					} else {
						System.err.println("Failed to log in");
						System.out.println();
					}
				} else if (answer.equalsIgnoreCase("n")) {
					return;
				} else {
					throw new InputMismatchException("Please enter a valid answer. Y for yes and N for no.\n");
				}

			} catch (InputMismatchException e) {
				System.err.println(e.getMessage());
			}
		}

	}

	public static void adminMenu() {
		Scanner scan = new Scanner(System.in);
		System.out.println("\n***Welcome Admin***");

		while (true) {
			try {
				System.out.println("1. Add book");
				System.out.println("2. View all books");
				System.out.println("3. Update book");
				System.out.println("4. Delete book");
				System.out.println("5. Log Out");

				System.out.print("Enter your option: ");
				int userInput = scan.nextInt();

				switch (userInput) {
				case 1:
					BookView.addBook();
					break;
					
				case 2:
					BookView.viewAllBooks();
					break;

				case 5:
					System.out.println("Admin successfully logged out.");
					return;

				default:
					System.out.println("Invalid option. Please enter a valid option from 1 to 5.");
				}
			} catch (InputMismatchException e) {
				System.err.println("Invalid option. Please enter a valid option from 1 to 5.\\n");
			}
		}
	}
}
