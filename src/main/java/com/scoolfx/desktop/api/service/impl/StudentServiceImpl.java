package com.scoolfx.desktop.api.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scoolfx.desktop.api.dao.IStudentRepository;
import com.scoolfx.desktop.api.exception.StudentException;
import com.scoolfx.desktop.api.exception.error.Errors;
import com.scoolfx.desktop.api.model.Student;
import com.scoolfx.desktop.api.service.IStudentService;

@Service
public class StudentServiceImpl implements IStudentService {

	@Autowired
	private IStudentRepository studentRepository;

	@Override
	public Student createStudent(Student student) throws StudentException {
		return studentRepository.save(student);
	}

	@Override
	public Student updateStudent(Student student, long studentId) throws StudentException {
		final Student studentDb = studentRepository.findOne(studentId);
		if (studentDb == null) {
			throw new StudentException(Errors.DATA_NOT_FOUND);
		}
		student.setId(studentId);
		return studentRepository.save(student);
	}

	@Override
	public Student getById(long studentId) throws StudentException {
		final Student studentDb = studentRepository.findOne(studentId);
		if (studentDb == null) {
			throw new StudentException(Errors.DATA_NOT_FOUND);
		}
		return studentDb;
	}

	@Override
	public List<Student> findAll() throws StudentException {
		return studentRepository.findAll();
	}

	@Override
	public void deleteById(long studentId) throws StudentException {
		final Student studentDb = studentRepository.findOne(studentId);
		if (studentDb == null) {
			throw new StudentException(Errors.DATA_NOT_FOUND);
		}
		studentRepository.delete(studentDb);
	}

	@Override
	public void deleteAll() throws StudentException {
		studentRepository.deleteAllInBatch();
	}

}
