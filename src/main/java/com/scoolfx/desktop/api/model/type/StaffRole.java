package com.scoolfx.desktop.api.model.type;

public enum StaffRole {
	ADMIN("Admin"),

	PRINCIPLE("Principle"),

	EMPLOYEE("Employee"),

	VISITOR("Visitor");

	private String role;

	private StaffRole(String role) {
		this.role = role;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

}
