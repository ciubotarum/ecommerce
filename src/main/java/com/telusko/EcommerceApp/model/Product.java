package com.telusko.EcommerceApp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data    // gives getters and setters
@AllArgsConstructor   // creates a constructor from all variables
@Component
public class Product {
    private int prodId;
    private String ProdName;
    private int price;

    public Product() {

    }
}
