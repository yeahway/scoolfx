package com.scoolfx.desktop.api.model.type;

public enum TransactionType {

	DEBIT("Dr"), CREDIT("Cr");

	private String type;

	private TransactionType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
