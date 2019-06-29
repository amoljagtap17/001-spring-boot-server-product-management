package com.react.springboot.serverproductmanagement.repository;

import com.react.springboot.serverproductmanagement.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
