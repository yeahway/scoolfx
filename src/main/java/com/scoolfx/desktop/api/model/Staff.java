package com.scoolfx.desktop.api.model;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import com.scoolfx.desktop.api.model.type.Gender;
import com.scoolfx.desktop.api.model.type.StaffRole;

@Entity
@Table(name = "STAFF")
@XmlRootElement
public class Staff extends Base {

	private static final long serialVersionUID = -1706267568140549312L;

	private String name;

	private StaffRole role = StaffRole.VISITOR;

	private boolean active;

	private String dob;

	private int age;

	private Gender gender = Gender.MALE;

	private String contact;

	private String address;

	private String email;

	private String url;

	@OneToOne
	private User user;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public StaffRole getRole() {
		return role;
	}

	public void setRole(StaffRole role) {
		this.role = role;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
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

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "Staff [name=" + name + ", role=" + role + ", active=" + active + ", dob=" + dob + ", age=" + age
				+ ", gender=" + gender + ", contact=" + contact + ", address=" + address + ", email=" + email + ", url="
				+ url + ", user=" + user + "]";
	}

}
