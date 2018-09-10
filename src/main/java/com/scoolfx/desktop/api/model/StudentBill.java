package com.scoolfx.desktop.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import com.scoolfx.desktop.api.model.type.Month;

@Entity
@Table(name = "STUDENT_BILL")
@XmlRootElement
public class StudentBill extends Base {

	private static final long serialVersionUID = 6160724511526603784L;

	@Column(unique = true, nullable = false)
	private long invoiceNo;

	private Month month = Month.BAISAKH;

	private String particulars;

	private double amount;

	@ManyToOne(optional = false, targetEntity = Student.class, fetch = FetchType.EAGER)
	@JoinColumn(name = "STUDENT_ID", referencedColumnName = "ID", nullable = false)
	private Student student;

	public long getInvoiceNo() {
		return invoiceNo;
	}

	public void setInvoiceNo(long invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	public Month getMonth() {
		return month;
	}

	public void setMonth(Month month) {
		this.month = month;
	}

	public String getParticulars() {
		return particulars;
	}

	public void setParticulars(String particulars) {
		this.particulars = particulars;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "StudentBill [invoiceNo=" + invoiceNo + ", month=" + month + ", particulars=" + particulars + ", amount="
				+ amount + ", student=" + student + "]";
	}

}
