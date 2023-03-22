package com.bookstore.model;

public class Book {
	private String bookName;
	private int isbn;
	private String author;
	private int edition;
	
	public Book() {};
	
	public Book(String bookName, int isbn, String author, int edition) {
		this.bookName = bookName;
		this.isbn = isbn;
		this.author = author;
		this.edition = edition;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getEdition() {
		return edition;
	}

	public void setEdition(int edition) {
		this.edition = edition;
	}

	@Override
	public String toString() {
		return String.format("%-30s%-10s%-20s%-5s\n", bookName, isbn, author, edition);	
	}
	
	
}
