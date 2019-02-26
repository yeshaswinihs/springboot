package com.yesh.springboot.security.SpringBootSecurity.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.yesh.springboot.security.SpringBootSecurity.utils.Role;

public class UserBean {
	@NotEmpty
	private String username="";
	@NotEmpty
	private String email="";
	@NotEmpty
	private String password="";
	@NotEmpty
	private String passwordRepeated="";
	@NotNull
	private Role role = Role.USER;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPasswordRepeated() {
		return passwordRepeated;
	}

	public void setPasswordRepeated(String passwordRepeated) {
		this.passwordRepeated = passwordRepeated;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

}
