package com.scoolfx.desktop.api.model.builder;

import java.io.Serializable;

import com.scoolfx.desktop.api.model.Staff;
import com.scoolfx.desktop.api.model.type.Gender;
import com.scoolfx.desktop.api.model.type.StaffRole;

public class StaffBuilder implements Serializable {

	private static final long serialVersionUID = 501714590431329352L;

	private final Staff staff = new Staff();

	public static StaffBuilder create() {
		return new StaffBuilder();
	}

	public StaffBuilder name(String name) {
		this.staff.setName(name);
		return this;
	}

	public StaffBuilder role(StaffRole role) {
		this.staff.setRole(role);
		return this;
	}

	public StaffBuilder address(String address) {
		this.staff.setAddress(address);
		return this;
	}

	public StaffBuilder active(boolean active) {
		this.staff.setActive(active);
		return this;
	}

	public StaffBuilder age(int age) {
		this.staff.setAge(age);
		return this;
	}

	public StaffBuilder dob(String dob) {
		this.staff.setDob(dob);
		return this;
	}

	public StaffBuilder gender(Gender gender) {
		this.staff.setGender(gender);
		return this;
	}

	public StaffBuilder contact(String contact) {
		this.staff.setContact(contact);
		return this;
	}

	public StaffBuilder email(String email) {
		this.staff.setEmail(email);
		return this;
	}

	public StaffBuilder url(String url) {
		this.staff.setUrl(url);
		return this;
	}

	public Staff build() {
		return this.staff;
	}

}
