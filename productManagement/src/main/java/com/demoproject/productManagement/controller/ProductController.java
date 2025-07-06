package com.demoproject.productManagement.controller;
import com.demoproject.productManagement.Product;
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
    public List<Product> getProduct() {
        return productService.getAllProducts();
    }
    @PostMapping("/add-product")
    public String createOrUpdateProduct(@RequestBody Product product) {
        productService.addProduct(product);
        return "Product saved successfully: " + product;
    }
}

