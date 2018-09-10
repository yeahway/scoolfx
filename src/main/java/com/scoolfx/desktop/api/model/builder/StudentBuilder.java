package com.scoolfx.desktop.api.model.builder;

import java.io.Serializable;
import java.util.List;

import com.scoolfx.desktop.api.model.FeeDue;
import com.scoolfx.desktop.api.model.Grade;
import com.scoolfx.desktop.api.model.Parent;
import com.scoolfx.desktop.api.model.Student;
import com.scoolfx.desktop.api.model.StudentBill;
import com.scoolfx.desktop.api.model.type.Gender;
import com.scoolfx.desktop.api.model.type.Section;

public class StudentBuilder implements Serializable {

	private static final long serialVersionUID = -1850050178646071082L;

	private final Student student = new Student();

	public static StudentBuilder create() {
		return new StudentBuilder();
	}

	public StudentBuilder name(String name) {
		this.student.setName(name);
		return this;
	}

	public StudentBuilder section(Section section) {
		this.student.setSection(section);
		return this;
	}

	public StudentBuilder rollNo(long rollNo) {
		this.student.setRollNo(rollNo);
		return this;
	}

	public StudentBuilder dob(String dob) {
		this.student.setDob(dob);
		return this;
	}

	public StudentBuilder age(int age) {
		this.student.setAge(age);
		return this;
	}

	public StudentBuilder gender(Gender gender) {
		this.student.setGender(gender);
		return this;
	}

	public StudentBuilder address(String address) {
		this.student.setAddress(address);
		return this;
	}

	public StudentBuilder phoneNo(String phoneNo) {
		this.student.setPhoneNo(phoneNo);
		return this;
	}

	public StudentBuilder email(String email) {
		this.student.setEmail(email);
		return this;
	}

	public StudentBuilder active(boolean active) {
		this.student.setActive(active);
		return this;
	}

	public StudentBuilder url(String url) {
		this.student.setUrl(url);
		return this;
	}

	public StudentBuilder feeDue(FeeDue feeDue) {
		this.student.setFeeDue(feeDue);
		return this;
	}

	public StudentBuilder grade(Grade grade) {
		this.student.setGrade(grade);
		return this;
	}

	public StudentBuilder bills(List<StudentBill> bills) {
		this.student.setBills(bills);
		return this;
	}

	public StudentBuilder parents(List<Parent> parents) {
		this.student.setParents(parents);
		return this;
	}

	public Student build() {
		return this.student;
	}

}
