package com.scoolfx.desktop.api.service;

import java.util.List;

import com.scoolfx.desktop.api.exception.ParentException;
import com.scoolfx.desktop.api.model.Parent;

public interface IParentService {

	Parent createParent(Parent parent) throws ParentException;
	
	Parent updateParent(Parent newParent, long parentId) throws ParentException;
	
	Parent getById(long parentId) throws ParentException;
	
	List<Parent> getAll() throws ParentException;
	
	void deleteById(long parentId) throws ParentException;
	
	void deleteAll() throws ParentException;
}
