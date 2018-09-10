package com.scoolfx.desktop.api.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.scoolfx.desktop.api.model.builder.LoginDataBuilder;
import com.scoolfx.desktop.api.model.builder.UserBuilder;

public class UserTest {
	
	public static void main(String[] args) {

		User userFirst = UserBuilder.create().userName("Shekhar").password("Shekhar").build();
		User userSecond = UserBuilder.create().userName("Raja Ram").password("Raja").build();

		List<User> users = new ArrayList<>(Arrays.asList(userFirst, userSecond));

		users.forEach(u -> System.out.println(u.getUserName()));

		Collections.sort(users, new User());

		users.forEach(u -> System.out.println(u.getUserName()));

		LoginData data = LoginDataBuilder.create().userName("Shekhar").password("Shekhar").build();

		System.out.println(userFirst.authorize(data));
		System.out.println(userSecond.authorize(data));
	}
}
