package com.scoolfx.desktop.api.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@Table(name = "FEE_STRUCTURE")
@XmlRootElement
public class FeeStructure extends Base {

	private static final long serialVersionUID = 2903476942783017228L;

	private String particular;

	private double amount;

	@ManyToOne(optional = false, targetEntity = Grade.class, fetch = FetchType.EAGER)
	@JoinColumn(name = "GRADE_ID", nullable = false)
	private Grade grade;

	public String getParticular() {
		return particular;
	}

	public void setParticular(String particular) {
		this.particular = particular;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@XmlTransient
	public Grade getGrade() {
		return grade;
	}

	public void setGrade(Grade grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "FeeStructure [particular=" + particular + ", amount=" + amount + ", grade=" + grade + "]";
	}

}
