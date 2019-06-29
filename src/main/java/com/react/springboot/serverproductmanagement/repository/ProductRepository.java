package com.react.springboot.serverproductmanagement.repository;

import com.react.springboot.serverproductmanagement.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
