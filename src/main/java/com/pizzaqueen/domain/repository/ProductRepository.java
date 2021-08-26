package com.pizzaqueen.domain.repository;

import com.pizzaqueen.domain.crud.ProductCrudRepository;
import com.pizzaqueen.domain.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public class ProductRepository implements ProductRepo{
    @Autowired
    private ProductCrudRepository productCrudRepository;
    @Override
    public List<Product> getAll() {
        return (List<Product>) productCrudRepository.findAll();
    }

    @Override
    public List<Product> getByCategory(String productCategory) {
        return productCrudRepository.findByProductCategory(productCategory);
    }

    @Override
    public Optional<Product> getProduct(int idProduct) {
        return productCrudRepository.findById(idProduct);
    }

    @Override
    public Product save(Product product) {
        return productCrudRepository.save(product);
    }

    @Override
    public void delete(int idProduct) {
        productCrudRepository.deleteById(idProduct);
    }
}
