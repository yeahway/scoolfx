package com.scoolfx.desktop.api.model;

import java.io.Serializable;

public class LoginData implements Serializable {

	private static final long serialVersionUID = 1647709397181079896L;

	private String userName;

	private String email;

	private String password;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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

}
