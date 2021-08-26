package com.pizzaqueen.domain.service;

import com.pizzaqueen.domain.entity.Product;
import com.pizzaqueen.domain.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAll(){
        return productRepository.getAll();
    }
    public Optional<Product> getProduct(int idProduct){
        return productRepository.getProduct(idProduct);
    }

    public List<Product> getByCategory(String productCategory){
        return productRepository.getByCategory(productCategory);
    }

    public Product save(Product product){
        return productRepository.save(product);
    }

    public boolean delete(int idProduct){
        return getProduct(idProduct).map(
                product ->
                {
                    productRepository.delete(idProduct);
                    return true;
                }).orElse(false);
    }
}
