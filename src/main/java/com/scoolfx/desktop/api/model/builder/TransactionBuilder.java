package com.scoolfx.desktop.api.model.builder;

import java.io.Serializable;

import com.scoolfx.desktop.api.model.Transaction;
import com.scoolfx.desktop.api.model.User;
import com.scoolfx.desktop.api.model.type.TransactionType;

public class TransactionBuilder implements Serializable {

	private static final long serialVersionUID = 4192472248048288982L;

	private final Transaction transaction = new Transaction();

	public static TransactionBuilder create() {
		return new TransactionBuilder();
	}

	public TransactionBuilder year(int year) {
		this.transaction.setYear(year);
		return this;
	}

	public TransactionBuilder month(String month) {
		this.transaction.setMonth(month);
		return this;
	}

	public TransactionBuilder particulars(String particulars) {
		this.transaction.setParticulars(particulars);
		return this;
	}

	public TransactionBuilder user(User user) {
		this.transaction.setUser(user);
		return this;
	}

	public TransactionBuilder amount(double amount) {
		this.transaction.setAmount(amount);
		return this;
	}

	public TransactionBuilder type(TransactionType type) {
		this.transaction.setType(type);
		return this;
	}

	public Transaction build() {
		return this.transaction;
	}

}
