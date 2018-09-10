package com.scoolfx.desktop.api.service;

import java.util.List;

import com.scoolfx.desktop.api.exception.GradeException;
import com.scoolfx.desktop.api.model.Grade;

public interface IGradeService {

	Grade createGrade(Grade grade) throws GradeException;

	Grade updateGrade(Grade newGrade, long gradeId) throws GradeException;

	Grade getById(long gradeId) throws GradeException;

	List<Grade> getAll() throws GradeException;

	void deleteById(long gradeId) throws GradeException;

	void deleteAll() throws GradeException;
}
