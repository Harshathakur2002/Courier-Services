package com.app.sunbeam.service;

import java.util.List;

import com.app.sunbeam.entity.User;



public interface UserService {
	User addUser(User user);
	
	User updateUser(User user);

	User getUserByEmailAndStatus(String emailId, String status);

	User getUserByEmailid(String emailId);

	List<User> getUserByRole(String role);
	
	User getUserById(int userId);
	
	List<User> getUserByCourierAndRoleAndStatusIn(User courier, String role, List<String> status);
	
	User getUserByEmailIdAndRoleAndStatus(String emailId, String role, String status);
	
	List<User> updateAllUser(List<User> users);
	
	List<User> getUserByRoleAndStatus(String role, String status);
	
	User getUserByCustomerIdAndStatus(String customerRefId, String status);
	

}
