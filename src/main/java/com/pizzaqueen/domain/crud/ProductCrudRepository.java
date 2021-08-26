package com.pizzaqueen.domain.crud;

import com.pizzaqueen.domain.entity.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductCrudRepository extends CrudRepository<Product, Integer> {
    List<Product> findByProductCategory(String productCategory);
}
