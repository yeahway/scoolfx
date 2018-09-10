package com.scoolfx.desktop.api.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scoolfx.desktop.api.model.Action;
import com.scoolfx.desktop.api.model.User;

public interface IActionRepository extends JpaRepository<Action, Long> {

	List<Action> findByUser(User user);
}
