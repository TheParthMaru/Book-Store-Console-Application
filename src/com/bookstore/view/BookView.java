package com.bookstore.view;

import java.util.List;
import java.util.Scanner;

import com.bookstore.controller.BookController;
import com.bookstore.model.Book;

public class BookView {
	
	public static void addBook() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Add Book");
		while (true) {
			System.out.print("Enter book name: ");
			String bookName = scan.nextLine();
			
			System.out.print("Enter isbn: ");
			int isbn = scan.nextInt();
			
			System.out.print("Enter author: ");
			scan.nextLine();
			String author = scan.nextLine();
			
			System.out.print("Enter edition: ");
			int edition = scan.nextInt();
			
			BookController bookController = new BookController();
			int result = bookController.addBook(bookName, isbn, author, edition);
			
			if (result > 0) {
				System.out.println("Book Added");
				return;
			} else {
				System.out.println("Failed");
				return;
			}
			
		}
	}
	
	public static void viewAllBooks() {
		BookController bookController = new BookController();
		List<Book> books = bookController.viewAllBooks();
		
		if (books.size() > 0) {
			System.out.format("%-30s%-10s%-20s%-5s\n", "Book name", "ISBN", "Author", "Edition");
			for(Book book : books) {
				System.out.println(book);
			}
		} else {
			System.out.println("No records found");
		}
	}
}
