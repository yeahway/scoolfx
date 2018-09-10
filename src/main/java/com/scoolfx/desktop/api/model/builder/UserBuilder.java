package com.scoolfx.desktop.api.model.builder;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.scoolfx.desktop.api.model.Action;
import com.scoolfx.desktop.api.model.User;

public class UserBuilder implements Serializable {

	private static final long serialVersionUID = 8859424775441491037L;

	private final User user = new User();

	public static UserBuilder create() {
		return new UserBuilder();
	}

	public UserBuilder address(String address) {
		this.user.setAddress(address);
		return this;
	}

	public UserBuilder phoneNo(String phoneNo) {
		this.user.setPhoneNo(phoneNo);
		return this;
	}

	public UserBuilder email(String email) {
		this.user.setEmail(email);
		return this;
	}

	public UserBuilder userName(String userName) {
		this.user.setUserName(userName);
		return this;
	}

	public UserBuilder password(String password) {
		this.user.setPassword(password);
		return this;
	}

	public UserBuilder firstName(String firstName) {
		this.user.setFirstName(firstName);
		return this;
	}

	public UserBuilder lastName(String lastName) {
		this.user.setLastName(lastName);
		return this;
	}

	public UserBuilder actions(List<Action> actions) {
		this.user.setActions(actions);
		return this;
	}

	// from parent(Base) class

	public UserBuilder createdAt(Date createdAt) {
		this.user.setCreatedAt(createdAt);
		return this;
	}

	public UserBuilder updatedAt(Date updatedAt) {
		this.user.setUpdatedAt(updatedAt);
		return this;
	}

	public UserBuilder createdBy(String createdBy) {
		this.user.setCreatedBy(createdBy);
		return this;
	}

	public UserBuilder admin(boolean admin) {
		this.user.setAdmin(admin);
		return this;
	}

	public UserBuilder updatedBy(String updatedBy) {
		this.user.setUpdatedBy(updatedBy);
		return this;
	}

	public User build() {
		return this.user;
	}

}
