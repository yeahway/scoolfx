package com.scoolfx.desktop.api.model.type;

public enum ActionType {

	LOGIN("Login"),

	LOGOUT("Logout"),

	FINANCIAL_TRANSACTION("Financial Transaction"),

	NORMAL_MODIFICATION("Normal Modification"),

	SENSITIVE_MODIFICATION("Sensitive Modification"),

	VIEW("View");

	private String action;

	private ActionType(String action) {
		this.action = action;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

}
