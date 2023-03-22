package com.bookstore.view;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainMenuView {
	public static void menu() {
		System.out.println("***Welcome to Book Store***");

		while (true) {
			Scanner scan = new Scanner(System.in);
			try {
				System.out.println("1. Login as admin");
				System.out.println("2. Login as customer");
				System.out.println("3. Create a new customer");
				System.out.println("4. Exit");
				System.out.print("Enter your option: ");

				int userOption = scan.nextInt();

				if (userOption == 1) {
					AdminView.adminLogin();
				} else if (userOption == 2) {
					System.out.println("Going to Login as customer");
				} else if (userOption == 3) {
					System.out.println("Going to Create a new customer");
				} else if (userOption == 4) {
					System.out.println("Thank you.");
					break;
				} else {
					System.out.println("Invalid option. Please enter a valid option from 1 to 4.\n");
				}
			} catch (InputMismatchException e) {
//					System.out.println("Exception in MainMenuView -> menu()");
				System.out.println("Please enter a valid integer number as option from 1 to 4.\n");
//					e.printStackTrace();
			}
		}
	}
}
