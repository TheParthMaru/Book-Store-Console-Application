package com.bookstore.controller;

import com.bookstore.dao.AdminDAOImpl;
import com.bookstore.model.Admin;
import com.bookstore.model.Book;

public class AdminController {
	AdminDAOImpl impl = new AdminDAOImpl();

	public boolean adminLogin(String username, String password) {
		Admin admin = new Admin(username, password);
		return impl.adminLogin(admin);
	}
}
