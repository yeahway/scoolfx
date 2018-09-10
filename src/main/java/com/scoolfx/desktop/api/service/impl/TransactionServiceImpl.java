package com.scoolfx.desktop.api.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scoolfx.desktop.api.dao.ITransactionRepository;
import com.scoolfx.desktop.api.exception.TransactionException;
import com.scoolfx.desktop.api.exception.error.Errors;
import com.scoolfx.desktop.api.model.Transaction;
import com.scoolfx.desktop.api.service.ITransactionService;

@Service
public class TransactionServiceImpl implements ITransactionService {

	@Autowired
	private ITransactionRepository transactionRepository;

	@Override
	public Transaction createTransaction(Transaction transaction) throws TransactionException {
		return transactionRepository.save(transaction);
	}

	@Override
	public Transaction updateTransaction(Transaction transaction, long transactionId) throws TransactionException {
		final Transaction transactionDb = transactionRepository.findOne(transactionId);
		if (transactionDb == null) {
			throw new TransactionException(Errors.DATA_NOT_FOUND);
		}
		transaction.setId(transactionId);
		return transactionRepository.save(transaction);
	}

	@Override
	public Transaction getById(long transactionId) throws TransactionException {
		final Transaction transactionDb = transactionRepository.findOne(transactionId);
		if (transactionDb == null) {
			throw new TransactionException(Errors.DATA_NOT_FOUND);
		}
		return transactionDb;
	}

	@Override
	public List<Transaction> getAll() throws TransactionException {
		return transactionRepository.findAll();
	}

	@Override
	public void deleteById(long transactionId) throws TransactionException {
		final Transaction transactionDb = transactionRepository.findOne(transactionId);
		if (transactionDb == null) {
			throw new TransactionException(Errors.DATA_NOT_FOUND);
		}
		transactionRepository.delete(transactionDb);
	}

	@Override
	public void deleteAll() throws TransactionException {
		transactionRepository.deleteAllInBatch();
	}

}
