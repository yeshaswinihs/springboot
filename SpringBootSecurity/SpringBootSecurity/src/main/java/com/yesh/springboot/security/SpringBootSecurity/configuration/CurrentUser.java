package com.yesh.springboot.security.SpringBootSecurity.configuration;

import org.springframework.security.core.authority.AuthorityUtils;

import com.yesh.springboot.security.SpringBootSecurity.domain.User;
import com.yesh.springboot.security.SpringBootSecurity.utils.Role;

public class CurrentUser extends org.springframework.security.core.userdetails.User {

	private static final long serialVersionUID = 1L;
	private User user;

	public CurrentUser(User user) {
		super(user.getUsername(), user.getPassword(), AuthorityUtils.createAuthorityList(user.getRole().toString()));
		this.user = user;
	}

	public User getUser() {
		return user;
	}

	public Long getId() {

		return user.getUserid();

	}

	public void setUser(User user) {
		this.user = user;
	}

	public Role getRole() {
		return user.getRole();
	}

	@Override
	public String toString() {
		return "CurrentUser [user=" + user + "]";
	}

}
