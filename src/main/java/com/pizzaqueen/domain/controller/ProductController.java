package com.pizzaqueen.domain.controller;

import com.pizzaqueen.domain.entity.Product;
import com.pizzaqueen.domain.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
    @RequestMapping("products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/all")
    public ResponseEntity<List<Product>> getAll(){
        return new ResponseEntity(productService.getAll(), HttpStatus.OK);
    }
    @GetMapping("/{idProduct}")
    public ResponseEntity getProduct(@PathVariable("idProduct") int idProduct){
        return (ResponseEntity)productService.getProduct(idProduct).map(
                (product) ->{
                    return new ResponseEntity(product, HttpStatus.OK);
                }).orElse(new ResponseEntity(HttpStatus.NOT_FOUND));

    }
    @GetMapping("/category/{productCategory}")
    public ResponseEntity<List<Product>> getByCategory(@PathVariable("productCategory") String productCategory) {
        return new ResponseEntity(productService.getByCategory(productCategory), HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<Product> save(@RequestBody Product product){
        return new ResponseEntity(productService.save(product),HttpStatus.CREATED);
    }
    @DeleteMapping("/delete/{idProduct}")
    public ResponseEntity delete(@PathVariable("idProduct") int idProduct){
        return productService.delete(idProduct)
                ? new ResponseEntity(HttpStatus.OK)
                : new ResponseEntity(HttpStatus.NOT_FOUND);
    }

}

