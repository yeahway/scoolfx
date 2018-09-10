package com.scoolfx.desktop.api.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scoolfx.desktop.api.dao.IParentRepository;
import com.scoolfx.desktop.api.exception.ParentException;
import com.scoolfx.desktop.api.exception.error.Errors;
import com.scoolfx.desktop.api.model.Parent;
import com.scoolfx.desktop.api.service.IParentService;

@Service
public class ParentServiceImpl implements IParentService {

	@Autowired
	private IParentRepository parentRepository;

	@Override
	public Parent createParent(Parent parent) throws ParentException {
		return parentRepository.save(parent);
	}

	@Override
	public Parent updateParent(Parent newParent, long parentId) throws ParentException {
		final Parent parentDb = parentRepository.findOne(parentId);
		if (parentDb == null) {
			throw new ParentException(Errors.DATA_NOT_FOUND);
		}
		newParent.setId(parentId);
		return parentRepository.save(newParent);
	}

	@Override
	public Parent getById(long parentId) throws ParentException {
		final Parent parentDb = parentRepository.findOne(parentId);
		if (parentDb == null) {
			throw new ParentException(Errors.DATA_NOT_FOUND);
		}
		return parentDb;
	}

	@Override
	public List<Parent> getAll() throws ParentException {
		return parentRepository.findAll();
	}

	@Override
	public void deleteById(long parentId) throws ParentException {
		final Parent parentDb = parentRepository.findOne(parentId);
		if (parentDb == null) {
			throw new ParentException(Errors.DATA_NOT_FOUND);
		}
		parentRepository.delete(parentId);
	}

	@Override
	public void deleteAll() throws ParentException {
		parentRepository.deleteAllInBatch();
	}

}
