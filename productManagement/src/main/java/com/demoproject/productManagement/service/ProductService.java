package com.demoproject.productManagement.service;

import com.demoproject.productManagement.entity.Product;
import com.demoproject.productManagement.ProductDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    @Autowired // i want the object of ProductDB search it and give it
    ProductDB db;

    public void addProduct(Product product) {
        db.save(product);
    }

    public List<Product> getAllProducts(String name) {
        List<Product> products = db.findAll();
        if(name != null && !name.isEmpty()){
            List<Product> filteredProducts = new ArrayList<>();
            for(Product p : products){
                if(p.getName().equals(name)){
                    filteredProducts.add(p);
                }
            }
            return filteredProducts;
        }
        return products;
    }
    public List<Product> getProductWithText(String searchedText){
        List<Product> products = db.findAll();
        String searched = searchedText.toLowerCase();
        List<Product> prods = new ArrayList<>();
        for(Product p: products){
            String name = p.getName().toLowerCase();
            String type = p.getType().toLowerCase();
            String place = p.getPlace().toLowerCase();
            if(name.contains(searched) || type.contains(searched) || place.contains(searched))
                prods.add(p);
        }
        return prods;
    }
}
