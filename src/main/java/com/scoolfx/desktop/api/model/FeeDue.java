package com.scoolfx.desktop.api.model;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@Table(name = "DUE_AMOUNT")
public class FeeDue extends Base {

	private static final long serialVersionUID = 1119507639947917411L;

	private double amount;

	@OneToOne
	private Student student;

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@XmlTransient
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "FeeDue [amount=" + amount + ", student=" + student + "]";
	}

}
