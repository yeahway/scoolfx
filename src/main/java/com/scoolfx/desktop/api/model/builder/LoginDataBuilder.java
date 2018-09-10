package com.scoolfx.desktop.api.model.builder;

import java.io.Serializable;

import com.scoolfx.desktop.api.model.LoginData;

public class LoginDataBuilder implements Serializable {

	private static final long serialVersionUID = -7573479515738494491L;

	private final LoginData loginData = new LoginData();

	public static LoginDataBuilder create() {
		return new LoginDataBuilder();
	}

	public LoginDataBuilder userName(String userName) {
		this.loginData.setUserName(userName);
		return this;
	}

	public LoginDataBuilder email(String email) {
		this.loginData.setEmail(email);
		return this;
	}

	public LoginDataBuilder password(String password) {
		this.loginData.setPassword(password);
		return this;
	}

	public LoginData build() {
		return this.loginData;
	}

}
