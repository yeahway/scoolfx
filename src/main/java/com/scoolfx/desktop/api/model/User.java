package com.scoolfx.desktop.api.model;

import java.util.Comparator;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.scoolfx.desktop.api.auth.IAuthorization;

@Entity(name = "USER")
@Table
@XmlRootElement
public class User extends Base implements IAuthorization<LoginData>, Comparator<User>, Comparable<User> {

	private static final long serialVersionUID = -1965910270395640216L;

	@Column(unique = true, nullable = false)
	private String userName;

	@Column(nullable = false)
	private String firstName;

	@Column(nullable = false)
	private String lastName;

	@Column(unique = true, nullable = false)
	private String password;

	@Column(nullable = false)
	private boolean admin = false;

	// Optional fields

	private String phoneNo;

	@Column(unique = true)
	private String email;

	private String address;

	@OneToMany(mappedBy = "user", cascade = CascadeType.DETACH, fetch = FetchType.EAGER, targetEntity = Action.class)
	@Fetch(value = FetchMode.SUBSELECT)
	private List<Action> actions;

	@ManyToMany(mappedBy = "users")
	private Transaction transactions;

	// Mini function to test updates.
	@Transient
	final private static BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = encoder.encode(password);
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public boolean isAdmin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}

	public List<Action> getActions() {
		return actions;
	}

	public void setActions(List<Action> actions) {
		this.actions = actions;
	}

	@Override
	public int compareTo(User user) {
		return this.getUserName().compareTo(user.getUserName());
	}

	@Override
	public boolean authorize(LoginData loginData) {
		return encoder.matches(loginData.getPassword(), this.getPassword());
	}

	@Override
	public int compare(User first, User second) {
		return first.getUserName().compareTo(second.getUserName());
	}

	public Transaction getTransactions() {
		return transactions;
	}

	public void setTransactions(Transaction transactions) {
		this.transactions = transactions;
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", firstName=" + firstName + ", lastName=" + lastName + ", password="
				+ password + ", admin=" + admin + ", phoneNo=" + phoneNo + ", email=" + email + ", address=" + address
				+ ", actions=" + actions + ", transactions=" + transactions + "]";
	}

}
