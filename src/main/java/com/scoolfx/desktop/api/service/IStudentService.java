package com.scoolfx.desktop.api.service;

import java.util.List;

import com.scoolfx.desktop.api.exception.StudentException;
import com.scoolfx.desktop.api.model.Student;

public interface IStudentService {
	Student createStudent(Student student) throws StudentException;

	Student updateStudent(Student student, long studentId) throws StudentException;

	Student getById(long studentId) throws StudentException;

	List<Student> findAll() throws StudentException;

	void deleteById(long studentId) throws StudentException;

	void deleteAll() throws StudentException;
}
