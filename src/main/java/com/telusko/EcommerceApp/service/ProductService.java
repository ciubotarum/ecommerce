package com.telusko.EcommerceApp.service;

import com.telusko.EcommerceApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products = Arrays.asList(
            new Product(101, "Iphone", 5000),
            new Product(120, "Cannon Camera", 7000),
            new Product(103, "Shure Mic", 20000));

    public List<Product> getProducts() {
        return products;
    }
}
