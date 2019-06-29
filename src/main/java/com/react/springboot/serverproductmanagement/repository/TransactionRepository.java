package com.react.springboot.serverproductmanagement.repository;

import com.react.springboot.serverproductmanagement.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
