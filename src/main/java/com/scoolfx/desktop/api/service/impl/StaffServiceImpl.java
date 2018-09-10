package com.scoolfx.desktop.api.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.scoolfx.desktop.api.dao.IStaffRepository;
import com.scoolfx.desktop.api.exception.StaffException;
import com.scoolfx.desktop.api.exception.error.Errors;
import com.scoolfx.desktop.api.model.Staff;
import com.scoolfx.desktop.api.service.IStaffService;

@Service
public class StaffServiceImpl implements IStaffService {

	private IStaffRepository staffRepository;

	@Override
	public Staff createStaff(Staff staff) throws StaffException {
		return staffRepository.save(staff);
	}

	@Override
	public Staff updateStaff(Staff newStaff, long staffId) throws StaffException {
		final Staff staffDb = staffRepository.findOne(staffId);
		if (staffDb == null) {
			throw new StaffException(Errors.DATA_NOT_FOUND);
		}
		newStaff.setId(staffId);
		return staffRepository.save(newStaff);
	}

	@Override
	public Staff getById(long staffId) throws StaffException {
		final Staff staffDb = staffRepository.findOne(staffId);
		if (staffDb == null) {
			throw new StaffException(Errors.DATA_NOT_FOUND);
		}
		return staffDb;
	}

	@Override
	public List<Staff> getAll() throws StaffException {
		return staffRepository.findAll();
	}

	@Override
	public void deleteById(Long staffId) throws StaffException {
		final Staff staffDb = staffRepository.findOne(staffId);
		if (staffDb == null) {
			throw new StaffException(Errors.DATA_NOT_FOUND);
		}
		staffRepository.delete(staffDb);
	}

	@Override
	public void deleteAll() throws StaffException {
		staffRepository.deleteAllInBatch();
	}

}
