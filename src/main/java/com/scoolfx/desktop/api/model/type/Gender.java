package com.scoolfx.desktop.api.model.type;

public enum Gender {

	MALE("Male"),

	FEMALE("Female"),

	OTHERS("Others");

	private String gender;

	private Gender(String gender) {
		this.gender = gender;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
