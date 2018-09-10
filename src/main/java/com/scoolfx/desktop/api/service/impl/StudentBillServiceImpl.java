package com.scoolfx.desktop.api.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scoolfx.desktop.api.dao.IStudentBillRepository;
import com.scoolfx.desktop.api.exception.StudentBillException;
import com.scoolfx.desktop.api.exception.error.Errors;
import com.scoolfx.desktop.api.model.StudentBill;
import com.scoolfx.desktop.api.service.IStudentBillService;

@Service
public class StudentBillServiceImpl implements IStudentBillService {

	@Autowired
	private IStudentBillRepository studentBillRepository;

	@Override
	public StudentBill createStudentBill(StudentBill studentBill) throws StudentBillException {
		return studentBillRepository.save(studentBill);
	}

	@Override
	public StudentBill updateStudentBill(StudentBill newStudentBill, long studentBillNo) throws StudentBillException {
		final StudentBill studentBill = studentBillRepository.findOne(studentBillNo);
		if (studentBill == null) {
			throw new StudentBillException(Errors.DATA_NOT_FOUND);
		}
		newStudentBill.setId(studentBillNo);
		return studentBillRepository.save(newStudentBill);
	}

	@Override
	public StudentBill getById(long studentBillId) throws StudentBillException {
		final StudentBill studentBill = studentBillRepository.findOne(studentBillId);
		if (studentBill == null) {
			throw new StudentBillException(Errors.DATA_NOT_FOUND);
		}
		return studentBill;
	}

	@Override
	public List<StudentBill> getAll() throws StudentBillException {
		return studentBillRepository.findAll();
	}

	@Override
	public void deleteById(long studentBillId) throws StudentBillException {
		final StudentBill studentBill = studentBillRepository.findOne(studentBillId);
		if (studentBill == null) {
			throw new StudentBillException(Errors.DATA_NOT_FOUND);

		}
		studentBillRepository.delete(studentBill);
	}

	@Override
	public void deleteAll() throws StudentBillException {
		studentBillRepository.deleteAllInBatch();
	}

}
