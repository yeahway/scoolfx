package com.scoolfx.desktop.api.model.builder;

import java.io.Serializable;

import com.scoolfx.desktop.api.model.Student;
import com.scoolfx.desktop.api.model.StudentBill;
import com.scoolfx.desktop.api.model.type.Month;

public class StudentBillBuilder implements Serializable {

	private static final long serialVersionUID = 3936584189502790454L;

	private StudentBill studentBill = new StudentBill();

	public static StudentBillBuilder create() {
		return new StudentBillBuilder();
	}

	public StudentBillBuilder invoiceNo(long invoiceNo) {
		this.studentBill.setInvoiceNo(invoiceNo);
		return this;
	}

	public StudentBillBuilder amount(double amount) {
		this.studentBill.setAmount(amount);
		return this;
	}

	public StudentBillBuilder particulars(String particulars) {
		this.studentBill.setParticulars(particulars);
		return this;
	}

	public StudentBillBuilder student(Student student) {
		this.studentBill.setStudent(student);
		return this;
	}

	public StudentBillBuilder month(Month month) {
		this.studentBill.setMonth(month);
		return this;
	}

	public StudentBill buil() {
		return this.studentBill;
	}
}
