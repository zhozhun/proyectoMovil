package com.example.app.backend;

import java.util.ArrayList;
import java.util.List;

public class Users {
    private String name;
    private String email;
    private List<Product> cart;

    public Users(String name, String email) {
        this.name = name;
        this.email = email;
        this.cart = new ArrayList<>();
    }

    public void addToCart(Product product) {
        this.cart.add(product);
    }

    public List<Product> getCart() {
        return this.cart;
    }
}
