package com.scoolfx.desktop.api.model.builder;

import java.io.Serializable;

import com.scoolfx.desktop.api.model.FeeDue;
import com.scoolfx.desktop.api.model.Student;

public class FeeDueBuilder implements Serializable {

	private static final long serialVersionUID = 8024008713048982664L;
	
	private FeeDue feeDue = new FeeDue();
	
	public static FeeDueBuilder create() {
		return new FeeDueBuilder();
	}
	
	public FeeDueBuilder amount(double amount) {
		this.feeDue.setAmount(amount);
		return this;
	}
	
	public FeeDueBuilder student(Student student) {
		this.feeDue.setStudent(student);
		return this;
	}
	
	public FeeDue build( ) {
		return this.feeDue;
	}

}
