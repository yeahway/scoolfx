package com.scoolfx.desktop.api.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scoolfx.desktop.api.dao.IGradeRepository;
import com.scoolfx.desktop.api.exception.GradeException;
import com.scoolfx.desktop.api.exception.error.Errors;
import com.scoolfx.desktop.api.model.Grade;
import com.scoolfx.desktop.api.service.IGradeService;

@Service
public class GradeServiceImpl implements IGradeService {

	@Autowired
	private IGradeRepository gradeRepository;

	@Override
	public Grade createGrade(Grade grade) throws GradeException {
		return gradeRepository.save(grade);
	}

	@Override
	public Grade updateGrade(Grade newGrade, long gradeId) throws GradeException {
		final Grade gradeDb = gradeRepository.findOne(gradeId);
		if (gradeDb == null) {
			throw new GradeException(Errors.DATA_NOT_FOUND);
		}

		newGrade.setId(gradeId);
		return gradeRepository.save(newGrade);
	}

	@Override
	public Grade getById(long gradeId) throws GradeException {
		final Grade gradeDb = gradeRepository.findOne(gradeId);
		if (gradeDb == null) {
			throw new GradeException(Errors.DATA_NOT_FOUND);
		}
		return gradeDb;
	}

	@Override
	public List<Grade> getAll() throws GradeException {
		return gradeRepository.findAll();
	}

	@Override
	public void deleteById(long gradeId) throws GradeException {
		final Grade gradeDb = gradeRepository.findOne(gradeId);
		if (gradeDb == null) {
			throw new GradeException(Errors.DATA_NOT_FOUND);
		}
		gradeRepository.delete(gradeDb);
	}

	@Override
	public void deleteAll() throws GradeException {
		gradeRepository.deleteAllInBatch();
	}

}
