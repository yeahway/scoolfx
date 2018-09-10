package com.scoolfx.desktop.api.service;

import java.util.List;

import com.scoolfx.desktop.api.exception.StudentBillException;
import com.scoolfx.desktop.api.model.StudentBill;

public interface IStudentBillService {
	
	StudentBill createStudentBill(StudentBill studentBill) throws StudentBillException;
	
	StudentBill updateStudentBill(StudentBill newStudentBill, long studentBillNo) throws StudentBillException;
	
	StudentBill getById(long studentBillId) throws StudentBillException;
	
	List<StudentBill> getAll() throws StudentBillException;
	
	void deleteById(long studentBillId) throws StudentBillException;
	
	void deleteAll() throws StudentBillException;
}
