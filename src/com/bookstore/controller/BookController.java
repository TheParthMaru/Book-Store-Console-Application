package com.bookstore.controller;

import java.util.List;

import com.bookstore.dao.BookDAOImpl;
import com.bookstore.model.Book;

public class BookController {
	
	BookDAOImpl impl = new BookDAOImpl();
	
	public int addBook(String bookName, int isbn, String author, int edition) {
		Book book = new Book(bookName, isbn, author, edition);
		return impl.addBook(book);
	}
	
	public List<Book> viewAllBooks() {
		Book book = new Book();
		return impl.bookList(book);
	}
}
