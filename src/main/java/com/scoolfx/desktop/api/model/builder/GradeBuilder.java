package com.scoolfx.desktop.api.model.builder;

import java.io.Serializable;
import java.util.List;

import com.scoolfx.desktop.api.model.FeeStructure;
import com.scoolfx.desktop.api.model.Grade;

public class GradeBuilder implements Serializable {

	private static final long serialVersionUID = 2772980768367183181L;

	private final Grade grade = new Grade();

	public static GradeBuilder create() {
		return new GradeBuilder();
	}

	public GradeBuilder name(String name) {
		this.grade.setName(name);
		return this;
	}

	public GradeBuilder fees(List<FeeStructure> fees) {
		this.grade.setFees(fees);
		return this;
	}

	public Grade build() {
		return this.grade;
	}
}
