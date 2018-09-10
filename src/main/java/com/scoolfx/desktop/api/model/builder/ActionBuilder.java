package com.scoolfx.desktop.api.model.builder;

import java.io.Serializable;

import com.scoolfx.desktop.api.model.Action;
import com.scoolfx.desktop.api.model.User;
import com.scoolfx.desktop.api.model.type.ActionType;

public class ActionBuilder implements Serializable {

	private static final long serialVersionUID = -874004297485006244L;

	private final Action action = new Action();

	public static ActionBuilder create() {
		return new ActionBuilder();
	}

	public ActionBuilder activity(String activity) {
		this.action.setActivities(activity);
		return this;
	}

	public ActionBuilder date(String date) {
		this.action.setDate(date);
		return this;
	}

	public ActionBuilder user(User user) {
		this.action.setUser(user);
		return this;
	}

	public ActionBuilder type(ActionType type) {
		this.action.setType(type);
		return this;
	}

	public Action build() {
		return this.action;
	}
}
