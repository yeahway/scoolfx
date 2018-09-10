package com.scoolfx.desktop.api.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.scoolfx.desktop.api.model.type.Gender;
import com.scoolfx.desktop.api.model.type.Section;

@Entity
@Table(name = "STUDENT")
@XmlRootElement
public class Student extends Base {

	private static final long serialVersionUID = -9182803004816422536L;

	private String name;

	private Section section = Section.A;

	private Long rollNo;

	private String dob;

	@Column(length = 4)
	private int age;

	private Gender gender = Gender.MALE;

	private String address;

	private String phoneNo;

	private String email;

	private boolean active;

	private String url;

	@OneToOne
	private FeeDue feeDue;

	@ManyToOne(optional = false, targetEntity = Grade.class, fetch = FetchType.EAGER)
	@JoinColumn(name = "STUDENT_ID", nullable = false, referencedColumnName = "ID")
	private Grade grade;

	@OneToMany(mappedBy = "student", cascade = CascadeType.DETACH, fetch = FetchType.EAGER, targetEntity = StudentBill.class)
	@Fetch(value = FetchMode.SUBSELECT)
	private List<StudentBill> bills;

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "STUDENT_HAS_PARENT", joinColumns = {
			@JoinColumn(name = "STUDENT_ID", referencedColumnName = "ID") }, inverseJoinColumns = {
					@JoinColumn(name = "PARENT_ID", referencedColumnName = "ID") })
	private List<Parent> parents;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Grade getGrade() {
		return grade;
	}

	public void setGrade(Grade grade) {
		this.grade = grade;
	}

	public Section getSection() {
		return section;
	}

	public void setSection(Section section) {
		this.section = section;
	}

	public Long getRollNo() {
		return rollNo;
	}

	public void setRollNo(Long rollNo) {
		this.rollNo = rollNo;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public List<Parent> getParents() {
		return parents;
	}

	public void setParents(List<Parent> parents) {
		this.parents = parents;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public FeeDue getFeeDue() {
		return feeDue;
	}

	public void setFeeDue(FeeDue feeDue) {
		this.feeDue = feeDue;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public List<StudentBill> getBills() {
		return bills;
	}

	public void setBills(List<StudentBill> bills) {
		this.bills = bills;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", section=" + section + ", rollNo=" + rollNo + ", dob=" + dob + ", age=" + age
				+ ", gender=" + gender + ", address=" + address + ", phoneNo=" + phoneNo + ", email=" + email
				+ ", active=" + active + ", url=" + url + ", feeDue=" + feeDue + ", grade=" + grade + ", bills=" + bills
				+ ", parents=" + parents + "]";
	}

}
