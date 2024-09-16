package com.kodebook.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodebook.entities.User;
import com.kodebook.repositories.UserRepository;

@Service
public class UserServiceImplementation implements UserService {

	@Autowired
	UserRepository repo;

	@Override
	public boolean userExists(String username, String email) {
		User user1=repo.findByUsername(username);
		User user2=repo.findByEmail(email);
		if(user1!=null || user2!=null) {
			return true;
			
		}
		
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void addUser(User user) {
		repo.save(user);
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean validateUser(String username, String password) {
		// TODO Auto-generated method stub
		String dbPass=repo.findByUsername(username). getPassword();
		if(password.equals(dbPass)) {
			return true;
		}
		return false;
	}
}
