package com.react.springboot.serverproductmanagement.service;

import com.react.springboot.serverproductmanagement.model.Transaction;

import java.util.List;

public interface TransactionService {

    Transaction saveTransaction(Transaction transaction);

    Long numberOfTransactions();

    List<Transaction> findAllTransactions();
}
