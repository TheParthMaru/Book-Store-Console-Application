package com.bookstore.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.bookstore.model.Admin;
import com.bookstore.util.DatabaseConnection;

public class AdminDAOImpl implements IAdminDAO{
	PreparedStatement pst;
	boolean result = false;

	@Override
	public boolean adminLogin(Admin admin) {
		
		try {
			pst = DatabaseConnection.getDbConnection().prepareStatement("select username, password from admin where username=? and password=?");
			pst.setString(1, admin.getUsername());
			pst.setString(2, admin.getPassword());
			
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				result = true;
			}
		} catch(Exception e) {
			System.out.println("Exception in AdminDAOImpl -> adminLogin()");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return result;
	}

}
