package com.demoproject.productManagement.controller;
import com.demoproject.productManagement.entity.Product;
import com.demoproject.productManagement.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class ProductController {

    private final ProductService productService;
    // ✅ Constructor Injection
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/product")
    public List<Product> getProduct(@RequestParam(required = false) String name) {
        return productService.getAllProducts(name);
    }
    @PostMapping("/add-product")
    public String createOrUpdateProduct(@RequestBody Product product) {
        productService.addProduct(product);
        return "Product saved successfully: " + product;
    }
}

