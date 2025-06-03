package com.tap.DAO.interfaces;

import java.util.List;

import com.tap.model.User;

public interface UserDAO {
	
	
	int saveUser(User user);
	
	List<User> getAllUsers();
	
	User getUserById(int id);
	
	void deleteUser(int id);
	
	User getUserByUserNameAndId(String name,int id);
	
	int updateUser(User user);

}
