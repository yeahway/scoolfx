package com.scoolfx.desktop.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import com.scoolfx.desktop.api.model.type.ActionType;

@Entity
@Table(name = "ACTION")
@XmlRootElement
public class Action extends Base {

	private static final long serialVersionUID = 4162481101151339006L;

	@Column(name = "ACTION_DATE", nullable = false)
	private String date;

	private String activities;

	private ActionType type;

	@ManyToOne(optional = false, targetEntity = User.class, fetch = FetchType.EAGER)
	@JoinColumn(name = "USER_ID", nullable = false)
	private User user;

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getActivities() {
		return activities;
	}

	public void setActivities(String activities) {
		this.activities = activities;
	}

	public ActionType getType() {
		return type;
	}

	public void setType(ActionType type) {
		this.type = type;
	}

	@XmlTransient
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Action [date=" + date + ", activities=" + activities + ", type=" + type + ", user=" + user + "]";
	}

}
