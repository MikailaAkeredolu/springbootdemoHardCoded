package com.tech552.democ9.repository;

import com.tech552.democ9.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}
