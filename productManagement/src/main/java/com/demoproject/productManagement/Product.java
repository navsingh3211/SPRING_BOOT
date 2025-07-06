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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public int getWarranty() {
        return warranty;
    }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", place='" + place + '\'' +
                ", warranty=" + warranty +
                '}';
    }
}
