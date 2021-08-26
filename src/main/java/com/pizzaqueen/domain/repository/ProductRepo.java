package com.pizzaqueen.domain.repository;

import com.pizzaqueen.domain.entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductRepo {
    List<Product> getAll();
    List<Product> getByCategory(String productCategory);
    Optional<Product> getProduct(int idProduct);
    Product save(Product product);
    void delete(int idProduct);
}
