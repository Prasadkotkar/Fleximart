package com.fleximart.service;

import com.fleximart.exception.UserException;
import com.fleximart.model.User;

public interface UserService {
	public User findUserProfileByJwt(String jwt) throws UserException;
	public User findUserByEmail(String email) throws UserException;


}
