package com.scoolfx.desktop.api.model.type;

public enum Section {
	A("A"),

	B("B"),

	C("C"),

	D("D"),

	E("E"),

	F("F");

	private String section;

	private Section(String section) {
		this.section = section;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

}
