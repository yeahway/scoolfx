package com.scoolfx.desktop.api.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scoolfx.desktop.api.model.Transaction;
import com.scoolfx.desktop.api.model.type.TransactionType;

public interface ITransactionRepository extends JpaRepository<Transaction, Long> {

	List<Transaction> findByTypeAndCreatedAtContaining(TransactionType type, Date date);
}
