package com.scoolfx.desktop.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scoolfx.desktop.api.model.Staff;
import com.scoolfx.desktop.api.model.User;

public interface IStaffRepository extends JpaRepository<Staff, Long> {

	Staff findByUser(User user);

}
