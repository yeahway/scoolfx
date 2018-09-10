package com.scoolfx.desktop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.scoolfx.desktop.api.dao.IUserRepository;
import com.scoolfx.desktop.api.exception.LoginException;
import com.scoolfx.desktop.api.model.LoginData;
import com.scoolfx.desktop.api.model.User;
import com.scoolfx.desktop.app.CurrentProperty;

@Controller
public class LoginController {

	@Autowired
	private IUserRepository userRepository;

	public boolean login(LoginData loginData) throws LoginException {
		if (loginData.getUserName() == null || loginData.getUserName().trim().length() < 1) {
			// throw new LoginException(Errors.DATA_NOT_FOUND);
			return false;
		}
		final User user = userRepository.findByUserNameIgnoreCase(loginData.getUserName());
		if (user == null) {
			// throw new LoginException(Errors.LOGIN_FAILED);
			return false;
		}

		if (user.authorize(loginData)) {
			CurrentProperty.CURRENT_USER = user;
			return true;
		}
		// throw new LoginException(Errors.LOGIN_FAILED);
		return false;
	}
}
