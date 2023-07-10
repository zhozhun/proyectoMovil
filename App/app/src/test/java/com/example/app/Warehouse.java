package com.example.app;

import java.util.HashMap;
import java.util.Map;

public class Warehouse {
    private Map<String, Integer> inventory;

    public Warehouse() {
        inventory = new HashMap<>();
    }

    public void addProduct(String product, int quantity) {
        inventory.put(product, quantity);
    }

    public void removeProduct(String product) {
        inventory.remove(product);
    }

    public int getProductQuantity(String product) {
        return inventory.getOrDefault(product, 0);
    }

    public void updateProductQuantity(String product, int quantity) {
        inventory.put(product, quantity);
    }
}
