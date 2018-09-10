package com.scoolfx.desktop.api.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scoolfx.desktop.api.dao.IFeeDueRepository;
import com.scoolfx.desktop.api.exception.FeeDueException;
import com.scoolfx.desktop.api.exception.error.Errors;
import com.scoolfx.desktop.api.model.FeeDue;
import com.scoolfx.desktop.api.service.IFeeDueService;

@Service
public class FeeDueServiceImpl implements IFeeDueService {

	@Autowired
	private IFeeDueRepository feeDueRepository;

	@Override
	public FeeDue createFeeDue(FeeDue feeDue) throws FeeDueException {

		return feeDueRepository.save(feeDue);
	}

	@Override
	public FeeDue updateFeeDue(FeeDue newFeeDue, long feeDueId) throws FeeDueException {
		final FeeDue feeDueDb = feeDueRepository.findOne(feeDueId);
		if (feeDueDb == null) {
			throw new FeeDueException(Errors.DATA_NOT_FOUND);
		}
		newFeeDue.setId(feeDueId);
		return feeDueRepository.save(newFeeDue);
	}

	@Override
	public FeeDue getById(long feeDueId) throws FeeDueException {
		final FeeDue feeDue = feeDueRepository.findOne(feeDueId);
		if (feeDue == null) {
			throw new FeeDueException(Errors.DATA_NOT_FOUND);
		}
		return feeDue;
	}

	@Override
	public List<FeeDue> getAll() throws FeeDueException {

		return feeDueRepository.findAll();
	}

	@Override
	public void deleteById(long feeDueId) throws FeeDueException {
		final FeeDue feeDue = feeDueRepository.findOne(feeDueId);
		if (feeDue == null) {
			throw new FeeDueException(Errors.DATA_NOT_FOUND);
		}
		feeDueRepository.delete(feeDue);
	}

	@Override
	public void deleteAll() throws FeeDueException {
		feeDueRepository.deleteAllInBatch();
	}

}
