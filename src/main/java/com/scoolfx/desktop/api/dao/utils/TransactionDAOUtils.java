package com.scoolfx.desktop.api.dao.utils;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.scoolfx.desktop.api.dao.ITransactionRepository;
import com.scoolfx.desktop.api.exception.TransactionException;
import com.scoolfx.desktop.api.exception.error.Errors;
import com.scoolfx.desktop.api.model.Transaction;
import com.scoolfx.desktop.api.model.type.TransactionType;

@Component
public class TransactionDAOUtils implements Serializable {

	private static final long serialVersionUID = -6541642451501338153L;

	@Autowired
	private ITransactionRepository transactionRepository;

	/**
	 * Retrieve the total transactions.
	 * 
	 * @return total no of transactions
	 */
	public long getTotalSize() {
		return transactionRepository.count();
	}

	/**
	 * Retrieves the total transaction amount for the particular transaction type.
	 * 
	 * @param type
	 *            Transaction Type
	 * @param date
	 *            When transaction was made(stored).
	 * @return total transaction amount of the specified {@link TransactionType}.
	 */
	public double getAmount(TransactionType type, Date date) throws TransactionException {
		final List<Transaction> transactions = transactionRepository.findByTypeAndCreatedAtContaining(type, date);
		if (transactions == null) {
			throw new TransactionException(Errors.DATA_NOT_FOUND);
		}
		final List<Double> amounts = transactions.stream().map(tr -> tr.getAmount()).collect(Collectors.toList());
		return mapToDouble(amounts);

	}

	/**
	 * Retrieves the total amount from the all transactions.
	 * 
	 * @return total transactions amount
	 */
	public double getTotalTransactions() {
		final List<Transaction> transactions = transactionRepository.findAll();
		if (transactions == null) {
			throw new TransactionException(Errors.DATA_NOT_FOUND);
		}
		final List<Double> amounts = transactions.stream().map(tr -> tr.getAmount()).collect(Collectors.toList());
		return mapToDouble(amounts);
	}

	/**
	 * Appends all the amounts and returns the sum amount.
	 * 
	 * @param amounts
	 *            list of amounts
	 * @return sum-amount of the provided list of amounts
	 */
	private double mapToDouble(List<Double> amounts) {
		double total_amount = 0;
		for (double amount : amounts) {
			total_amount += amount;
		}
		return total_amount;
	}

}
