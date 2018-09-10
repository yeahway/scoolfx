package com.scoolfx.desktop.api.service;

import java.util.List;

import com.scoolfx.desktop.api.exception.FeeStructureException;
import com.scoolfx.desktop.api.model.FeeStructure;

public interface IFeeStructureService {

	FeeStructure createFeeStructure(FeeStructure feeStructure) throws FeeStructureException;

	FeeStructure updateFeeStructure(FeeStructure newFeeStructure, long feeStructureId) throws FeeStructureException;
	
	FeeStructure getById(long feeStructureId) throws FeeStructureException;
	
	List<FeeStructure> getAll() throws FeeStructureException;
	
	void deleteById(long feeStructureId) throws FeeStructureException;
	
	void deleteAll() throws FeeStructureException;
}
