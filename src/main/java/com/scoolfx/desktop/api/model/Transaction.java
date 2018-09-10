package com.scoolfx.desktop.api.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import com.scoolfx.desktop.api.model.type.TransactionType;

@Entity
@Table(name = "TRANSACTION")
@XmlRootElement
public class Transaction extends Base {

	private static final long serialVersionUID = -5850693226501666519L;

	private int year = LocalDate.now().getYear();

	private String month = LocalDate.now().getMonth().name();

	private String particulars;

	private double amount;

	private TransactionType type = TransactionType.CREDIT;

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "TRANSACTION_HAS_USER", joinColumns = {
			@JoinColumn(name = "TRANSACTION_ID", referencedColumnName = "ID") }, inverseJoinColumns = {
					@JoinColumn(name = "USER_ID", referencedColumnName = "ID") })
	private User user;

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
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

	public TransactionType getType() {
		return type;
	}

	public void setType(TransactionType type) {
		this.type = type;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Transaction [year=" + year + ", month=" + month + ", particulars=" + particulars + ", amount=" + amount
				+ ", type=" + type + ", user=" + user + "]";
	}

}
