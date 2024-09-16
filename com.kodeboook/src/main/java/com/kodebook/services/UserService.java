package com.kodebook.services;

import java.util.List;

import com.kodebook.entities.Post;



public interface UserService {

	boolean userExists(String username, String email);

	 
	boolean validateUser(String username, String password);


	void addUser(com.kodebook.entities.User user);


	


		
}
