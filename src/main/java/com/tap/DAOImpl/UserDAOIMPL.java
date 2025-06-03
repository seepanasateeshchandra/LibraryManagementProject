package com.tap.DAOImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import com.tap.DAO.interfaces.UserDAO;
import com.tap.model.User;

import ConnectionFactory.ConnectionFactoryJdbc;

public class UserDAOIMPL implements UserDAO {
	
	public Connection getConnection() {
		Connection con = null;
		
		try {
			 con = ConnectionFactoryJdbc.requestConnection();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
		
	}

	@Override
	public int saveUser(User user) {
		// TODO Auto-generated method stub
		int value = 0;
	try {
		PreparedStatement pstmt1 = getConnection().prepareStatement("insert into users values(?,?,?,?,?)");
		pstmt1.setInt(1, user.getId());
		pstmt1.setString(2,user.getUserName());
		pstmt1.setString(3, user.getPassword());
		pstmt1.setString(4, user.getRole());
		
		value = pstmt1.executeUpdate();
		
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		return value;
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		List<User> allUsers = new ArrayList<>();
		
		try {
		
		PreparedStatement pstmt1 = getConnection().prepareStatement("select * from users");
		ResultSet res = pstmt1.executeQuery();
		
		while(res.next()) {
			int id = res.getInt(1);
			String name = res.getString(2);
			String password  = res.getString(3);
			String role = res.getString(4);
			
			allUsers.add(new User(id,name,password,role));
			
			
		}
		
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		return allUsers;
	}

	@Override
	public User getUserById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUser(int id) {
		try {
		PreparedStatement pstmt1 = getConnection().prepareStatement("delete from users  where id = ?");
		pstmt1.setInt(1, id);
		pstmt1.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public User getUserByUserNameAndId(String name, int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateUser(User user) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement pstmt1 = getConnection().prepareStatement("update users set id = ?,username = ?,password = ?,role = ? where id = ?");
			pstmt1.setInt(1, user.getId());
			pstmt1.setString(2,user.getUserName());
			pstmt1.setString(3, user.getPassword());
			pstmt1.setString(4, user.getRole());
			pstmt1.setInt(5, user.getId());
			
			return pstmt1.executeUpdate();
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return -1;
	}

}
