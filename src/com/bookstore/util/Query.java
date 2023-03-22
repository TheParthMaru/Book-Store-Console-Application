package com.bookstore.util;

public class Query {
	public static String addBook = "INSERT INTO book VALUES (?, ?, ?, ?)";
	public static String viewAllBooks = "SELECT * FROM book ORDER BY book_name";
}
