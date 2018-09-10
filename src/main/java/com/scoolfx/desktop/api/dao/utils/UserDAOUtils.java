package com.scoolfx.desktop.api.dao.utils;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.scoolfx.desktop.api.dao.IUserRepository;
import com.scoolfx.desktop.api.model.User;

/**
 * This is a supporter class for the user related operations.
 * 
 * @author Shekhar Rai
 * @since 0.2
 *
 */
@Component
public class UserDAOUtils implements Serializable {

	private static final long serialVersionUID = -7459667607108984009L;

	@Autowired
	private IUserRepository userRepository;

	/**
	 * Checks whether the provided userName belongs to any user or not.
	 * 
	 * @param userName
	 * @return true if user exists with the specified userName otherwise returns
	 *         false.
	 */
	public boolean exists(final String userName) {
		final User user = userRepository.findByUserNameIgnoreCase(userName);
		if (user == null) {
			return false;
		}
		return true;
	}

	/**
	 * It retrieves the size of the available users.
	 * 
	 * @return size of users
	 */
	public int count() {
		final List<User> users = userRepository.findAll();
		if (users != null) {
			return users.size();
		}
		return 0;
	}
}
