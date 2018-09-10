package com.scoolfx.desktop.api.service;

import java.util.List;

import com.scoolfx.desktop.api.exception.TransactionException;
import com.scoolfx.desktop.api.model.Transaction;

public interface ITransactionService {

	Transaction createTransaction(Transaction transaction) throws TransactionException;

	Transaction updateTransaction(Transaction transaction, long transactionId) throws TransactionException;

	Transaction getById(long transactionId) throws TransactionException;

	List<Transaction> getAll() throws TransactionException;

	void deleteById(long transactionId) throws TransactionException;

	void deleteAll() throws TransactionException;
}
