package com.scoolfx.desktop.api.model.type;

public enum Relation {

	FATHER("Father"),

	MOTHER("Mother");

	private String relation;

	private Relation(String relation) {
		this.relation = relation;
	}

	public String getRelation() {
		return relation;
	}

	public void setRelation(String relation) {
		this.relation = relation;
	}

}
