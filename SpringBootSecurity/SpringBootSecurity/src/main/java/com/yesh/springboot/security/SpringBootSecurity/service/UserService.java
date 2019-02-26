package com.yesh.springboot.security.SpringBootSecurity.service;

import java.util.Collection;

import com.yesh.springboot.security.SpringBootSecurity.domain.User;
import com.yesh.springboot.security.SpringBootSecurity.dto.UserBean;

public interface UserService {
	User getUserById(long id);

	User getUserByEmail(String email);

	Collection<User> getAllUsers();

	User create(UserBean userBean);

}
