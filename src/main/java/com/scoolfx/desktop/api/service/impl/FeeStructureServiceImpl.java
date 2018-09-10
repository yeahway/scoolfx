package com.scoolfx.desktop.api.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scoolfx.desktop.api.dao.IFeeStructureRepository;
import com.scoolfx.desktop.api.exception.FeeStructureException;
import com.scoolfx.desktop.api.exception.error.Errors;
import com.scoolfx.desktop.api.model.FeeStructure;
import com.scoolfx.desktop.api.service.IFeeStructureService;

@Service
public class FeeStructureServiceImpl implements IFeeStructureService {

	@Autowired
	private IFeeStructureRepository feeStructureRepository;

	@Override
	public FeeStructure createFeeStructure(FeeStructure feeStructure) throws FeeStructureException {

		return feeStructureRepository.save(feeStructure);
	}

	@Override
	public FeeStructure updateFeeStructure(FeeStructure newFeeStructure, long feeStructureId)
			throws FeeStructureException {
		final FeeStructure feeStructureDb = feeStructureRepository.findOne(feeStructureId);
		if (feeStructureDb == null) {
			throw new FeeStructureException(Errors.DATA_NOT_FOUND);
		}
		newFeeStructure.setId(feeStructureId);

		return feeStructureRepository.save(newFeeStructure);
	}

	@Override
	public FeeStructure getById(long feeStructureId) throws FeeStructureException {
		return feeStructureRepository.findOne(feeStructureId);
	}

	@Override
	public List<FeeStructure> getAll() throws FeeStructureException {
		return feeStructureRepository.findAll();
	}

	@Override
	public void deleteById(long feeStructureId) throws FeeStructureException {
		final FeeStructure feeStructureDb = feeStructureRepository.findOne(feeStructureId);
		if (feeStructureDb == null) {
			throw new FeeStructureException(Errors.DATA_NOT_FOUND);
		}
		feeStructureRepository.delete(feeStructureDb);
	}

	@Override
	public void deleteAll() throws FeeStructureException {
		feeStructureRepository.deleteAllInBatch();
	}

}
