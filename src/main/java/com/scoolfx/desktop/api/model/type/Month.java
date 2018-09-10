package com.scoolfx.desktop.api.model.type;

public enum Month {

	BAISAKH("Baisakh"),

	JESTHA("Jestha"),

	ASHADH("Asadha"),

	SHRAWAN("Shrawan"),

	BHADHRA("Bhadra"),

	ASWHIN("Aswhin"),

	KARTIK("Kartik"),

	MANSHIR("Mangshir"),

	POUSH("Poush"),

	MAGHA("Magha"),

	FALGUN("Falgun"),

	CHAITRA("Chaitra");

	private String month;

	private Month(String month) {
		this.month = month;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

}
