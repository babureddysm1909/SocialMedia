package com.kodebook.services;



public interface UserService {

	boolean userExists(String username, String email);

	 
	boolean validateUser(String username, String password);


	void addUser(com.kodebook.entities.User user);


		
}
