package com.scoolfx.desktop.api.service;

import java.util.List;

import com.scoolfx.desktop.api.exception.StaffException;
import com.scoolfx.desktop.api.model.Staff;

public interface IStaffService {

	Staff createStaff(Staff staff) throws StaffException;

	Staff updateStaff(Staff newStaff, long staffId) throws StaffException;

	Staff getById(long staffId) throws StaffException;

	List<Staff> getAll() throws StaffException;

	void deleteById(Long staffId) throws StaffException;

	void deleteAll() throws StaffException;
}
