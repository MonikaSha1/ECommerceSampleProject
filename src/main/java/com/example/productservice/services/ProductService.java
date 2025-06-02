package com.example.productservice.services;

import com.example.productservice.models.Product;

import java.util.List;

public interface ProductService {

    Product getSingleProduct(Long id);
    List<Product> getAllProducts();
    Product create(Product product);
    Product update(Product product);
    boolean delete(Product product);

}
