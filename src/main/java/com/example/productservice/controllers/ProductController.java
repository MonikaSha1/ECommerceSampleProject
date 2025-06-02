package com.example.productservice.controllers;

import com.example.productservice.models.Product;
import com.example.productservice.services.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("/products")
public class ProductController {
    public final RestTemplate restTemplate;
    private ProductService productService;

    public ProductController(ProductService productService, RestTemplate restTemplate) {
        this.productService = productService;
        this.restTemplate = restTemplate;
    }

    @GetMapping("/{id}")
    public Product getSingleProduct(@PathVariable("id") Long id) {
        System.out.println("DEBUG POINT");
       return productService.getSingleProduct(id);
    }
    @GetMapping
    public List<Product> getAllProducts() {
        List<Product> products = new ArrayList<>();
        return products;
    }

    @PostMapping()
    public Product createProduct(@RequestBody Product product) {
        return new Product();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable("id") Long productId) {
return null;

    }

    @PatchMapping
    public Product updateProduct(@RequestBody Product product) {
        return new Product();
    }

    @PutMapping
    public Product replaceProduct(@RequestBody Product product) {
        return new Product();
    }



}
