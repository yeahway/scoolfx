package com.scoolfx.desktop.api.model.builder;

import java.io.Serializable;

import com.scoolfx.desktop.api.model.FeeStructure;
import com.scoolfx.desktop.api.model.Grade;

public class FeeStructureBuilder implements Serializable {

	private static final long serialVersionUID = -5705897267418012584L;

	private final FeeStructure feeStructure = new FeeStructure();

	public static FeeStructureBuilder create() {
		return new FeeStructureBuilder();
	}

	public FeeStructureBuilder amount(double amount) {
		this.feeStructure.setAmount(amount);
		return this;
	}

	public FeeStructureBuilder particular(String particular) {
		this.feeStructure.setParticular(particular);
		return this;
	}

	public FeeStructureBuilder grade(Grade grade) {
		this.feeStructure.setGrade(grade);
		return this;
	}

	public FeeStructure build() {
		return this.feeStructure;
	}
}
