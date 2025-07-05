package com.demoproject.productManagement.controller;
import com.demoproject.productManagement.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    private final Product product;

    public ProductController(Product product) {
        this.product = product;
    }

    @GetMapping("/product")
    public Product getProduct() {
        return product;
    }
}

