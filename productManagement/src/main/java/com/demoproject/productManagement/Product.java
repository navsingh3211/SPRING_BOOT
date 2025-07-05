package com.demoproject.productManagement;
import org.springframework.stereotype.Component;

@Component
public class Product {
    private String name="ram";
    private String type;
    private String place;
    private int warranty;

    public Product(){}

    public Product(String type, String name, String place, int warranty) {
        this.type = type;
        this.name = name;
        this.place = place;
        this.warranty = warranty;
    }
    // Getter for JSON serialization
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Product{name='" + name + "'}";
    }
}
