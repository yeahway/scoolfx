package com.scoolfx.desktop.api.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scoolfx.desktop.api.dao.IActionRepository;
import com.scoolfx.desktop.api.dao.IUserRepository;
import com.scoolfx.desktop.api.exception.ActionException;
import com.scoolfx.desktop.api.exception.error.Errors;
import com.scoolfx.desktop.api.model.Action;
import com.scoolfx.desktop.api.model.User;
import com.scoolfx.desktop.api.service.IActionService;

@Service
public class ActionServiceImpl implements IActionService {

	@Autowired
	private IActionRepository actionRepository;

	@Autowired
	private IUserRepository userRepository;

	@Override
	public Action createAction(Action action) throws ActionException {

		return actionRepository.save(action);
	}

	@Override
	public Action updateAction(Action newAction, Long actionId) throws ActionException {
		final Action action = actionRepository.findOne(actionId);
		if (action == null) {
			throw new ActionException(Errors.DATA_NOT_FOUND);
		}
		newAction.setId(actionId);
		return actionRepository.save(newAction);
	}

	@Override
	public Action getById(Long actionId) throws ActionException {
		final Action action = actionRepository.findOne(actionId);
		if (action == null) {
			throw new ActionException(Errors.DATA_NOT_FOUND);
		}
		return action;
	}

	@Override
	public List<Action> getAll() throws ActionException {
		return actionRepository.findAll();
	}

	@Override
	public List<Action> getByUserId(long userId) throws ActionException {
		final User user = userRepository.findOne(userId);
		if (user == null) {
			throw new ActionException(Errors.DATA_NOT_FOUND);
		}
		return actionRepository.findByUser(user);
	}

	@Override
	public List<Action> getByUser(User user) throws ActionException {
		return actionRepository.findByUser(user);
	}

	@Override
	public void deleteAction(long actionId) throws ActionException {
		final Action action = actionRepository.findOne(actionId);
		if (action == null) {
			throw new ActionException(Errors.DATA_NOT_FOUND);
		}
		actionRepository.delete(action);
	}

}
