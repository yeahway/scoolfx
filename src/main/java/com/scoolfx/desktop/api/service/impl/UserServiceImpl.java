package com.scoolfx.desktop.api.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scoolfx.desktop.api.dao.IUserRepository;
import com.scoolfx.desktop.api.exception.UserException;
import com.scoolfx.desktop.api.exception.error.Errors;
import com.scoolfx.desktop.api.model.User;
import com.scoolfx.desktop.api.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private IUserRepository userRepository;

	@Override
	public User create(User user) throws UserException {
		return userRepository.save(user);
	}

	@Override
	public User update(User updateUser, long userId) throws UserException {
		final User userDb = userRepository.findOne(userId);
		if (userDb == null) {
			throw new UserException(Errors.USER_NOT_FOUND);
		}
		updateUser.setId(userId);
		return userRepository.save(updateUser);
	}

	@Override
	public void delete(long userId) throws UserException {
		final User userDb = userRepository.findOne(userId);
		if (userDb == null) {
			throw new UserException(Errors.USER_NOT_FOUND);
		}
		userRepository.delete(userDb);
	}

	@Override
	public List<User> getAll() throws UserException {
		return userRepository.findAll();
	}

	@Override
	public User getById(long userId) throws UserException {
		final User userDb = userRepository.findOne(userId);
		if (userDb == null) {
			throw new UserException(Errors.USER_NOT_FOUND);
		}
		return userDb;
	}

}
