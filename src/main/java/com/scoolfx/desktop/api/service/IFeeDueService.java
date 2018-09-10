package com.scoolfx.desktop.api.service;

import java.util.List;

import com.scoolfx.desktop.api.exception.FeeDueException;
import com.scoolfx.desktop.api.model.FeeDue;

public interface IFeeDueService {

	FeeDue createFeeDue(FeeDue feeDue) throws FeeDueException;
	
	FeeDue updateFeeDue(FeeDue newFeeDue, long feeDueId) throws FeeDueException;
	
	FeeDue getById(long feeDueId) throws FeeDueException;
	
	List<FeeDue> getAll() throws FeeDueException;
	
	void deleteById(long feeDueId) throws FeeDueException;
	
	void deleteAll() throws FeeDueException;
}
