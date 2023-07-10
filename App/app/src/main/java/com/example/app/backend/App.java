package com.example.app.backend;

public class App {
    public static void main(String[] args) {
        // Crear instancias de las clases
        Inventory inventory = new Inventory();
        Users user = new Users("Nombre de usuario", "correo@ejemplo.com");

        // Agregar productos al inventario
        Product product1 = new Product("Producto 1", 10);
        Product product2 = new Product("Producto 2", 15);
        inventory.addProduct(product1);
        inventory.addProduct(product2);

        // Agregar productos al carrito del usuario
        user.addToCart(product1);
        user.addToCart(product2);

        // Mostrar información en la consola
        System.out.println("Inventario:");
        System.out.println(inventory.getProducts());

        System.out.println("Carrito de compras del usuario:");
        System.out.println(user.getCart());
    }
}
