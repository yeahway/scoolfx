package com.scoolfx.desktop.api.service;

import java.util.List;

import com.scoolfx.desktop.api.exception.ActionException;
import com.scoolfx.desktop.api.model.Action;
import com.scoolfx.desktop.api.model.User;

public interface IActionService {

	Action createAction(Action action) throws ActionException;

	Action updateAction(Action newAction, Long actionId) throws ActionException;

	Action getById(Long actionId) throws ActionException;

	List<Action> getAll() throws ActionException;
	
	List<Action> getByUserId(long userId) throws ActionException;
	
	List<Action> getByUser(User user) throws ActionException;

	void deleteAction(long actionId) throws ActionException;
	
	
}
