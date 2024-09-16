package com.kodebook.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodebook.entities.User;

public interface UserRepository 
extends JpaRepository<User,Long>
	{

	User findByUsername(String username);

	User findByEmail(String email);
		
}

