package com.scoolfx.desktop.api.service;

import java.util.List;

import com.scoolfx.desktop.api.exception.UserException;
import com.scoolfx.desktop.api.model.User;

public interface IUserService {

	User create(User user) throws UserException;

	User update(User updateUser, long userId) throws UserException;

	void delete(long userId) throws UserException;

	List<User> getAll() throws UserException;

	User getById(long userId) throws UserException;

}
