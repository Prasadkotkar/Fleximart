package com.fleximart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fleximart.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	public User findByEmail(String username);
}
