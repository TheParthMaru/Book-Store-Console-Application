package com.bookstore.dao;

import java.util.List;

import com.bookstore.model.Book;

public interface IBookDAO {
	
	public int addBook(Book book);
	public List<Book> bookList(Book book);
}
