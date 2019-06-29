package com.react.springboot.serverproductmanagement.repository;

import com.react.springboot.serverproductmanagement.model.Transaction;
import org.springframework.data.repository.CrudRepository;

public interface TransactionRepository extends CrudRepository<Transaction, Long> {
}
