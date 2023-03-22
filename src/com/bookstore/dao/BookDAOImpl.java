package com.bookstore.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.bookstore.model.Book;
import com.bookstore.util.DatabaseConnection;
import com.bookstore.util.Query;

public class BookDAOImpl implements IBookDAO {
	PreparedStatement pst;
	int result = 0;

	@Override
	public int addBook(Book book) {
		try {
			pst = DatabaseConnection.getDbConnection().prepareStatement(Query.addBook);
			pst.setString(1, book.getBookName());
			pst.setInt(2, book.getIsbn());
			pst.setString(3, book.getAuthor());
			pst.setInt(4, book.getEdition());

			result = pst.executeUpdate();

		} catch (Exception e) {
			System.out.println("Exception occurrent in BookDAOImpl -> addBook()");
			System.out.println(e.getMessage());
		}

		return result;
	}

	@Override
	public List<Book> bookList(Book book) {
		List<Book> books = new ArrayList<Book>();
		
		try {
			pst = DatabaseConnection.getDbConnection().prepareStatement(Query.viewAllBooks);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				book = new Book(rs.getString(1), rs.getInt(2), rs.getString(3), rs.getInt(4));
				books.add(book);
			}
 		} catch (Exception e) {
 			System.err.println(e.getMessage());
 		}
		return books;
	}

}
