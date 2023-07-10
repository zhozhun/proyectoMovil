package com.example.app.backend;

public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getInfo() {
        return "Nombre: " + this.name + ", Precio: $" + this.price;
    }
}
