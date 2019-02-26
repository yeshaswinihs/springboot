package com.yesh.springboot.security.SpringBootSecurity.service;

import com.yesh.springboot.security.SpringBootSecurity.configuration.CurrentUser;

public interface CurrentUserService {
	boolean canAccessUser(CurrentUser currentUser, Long userId);
}
