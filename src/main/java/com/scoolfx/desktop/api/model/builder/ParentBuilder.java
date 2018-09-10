package com.scoolfx.desktop.api.model.builder;

import java.io.Serializable;

import com.scoolfx.desktop.api.model.Parent;
import com.scoolfx.desktop.api.model.type.Relation;

public class ParentBuilder implements Serializable {

	private static final long serialVersionUID = -532915699524981120L;

	private final Parent parent = new Parent();

	public static ParentBuilder create() {
		return new ParentBuilder();
	}

	public ParentBuilder name(String name) {
		this.parent.setName(name);
		return this;
	}

	public ParentBuilder relation(Relation relation) {
		this.parent.setRelation(relation);
		return this;
	}

	public ParentBuilder phoneNo(String phoneNo) {
		this.parent.setPhoneNo(phoneNo);
		return this;
	}

	public Parent build() {
		return this.parent;
	}

}
