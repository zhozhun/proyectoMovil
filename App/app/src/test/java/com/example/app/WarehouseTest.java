package com.example.app;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class WarehouseTest {
    private Warehouse warehouse;

    @Before
    public void setup() {
        // Configuración previa a las pruebas
        warehouse = new Warehouse();
        warehouse.addProduct("Product A", 10);
        warehouse.addProduct("Product B", 5);
    }

    @Test
    public void testAddProduct() {
        // Verifica si se agrega correctamente un producto al inventario
        warehouse.addProduct("Product C", 8);
        assertEquals(8, warehouse.getProductQuantity("Product C"));
    }

    @Test
    public void testRemoveProduct() {
        // Verifica si se elimina correctamente un producto del inventario
        warehouse.removeProduct("Product A");
        assertEquals(0, warehouse.getProductQuantity("Product A"));
    }

    @Test
    public void testGetProductQuantity() {
        // Verifica si se obtiene la cantidad correcta de un producto en el inventario
        assertEquals(10, warehouse.getProductQuantity("Product A"));
        assertEquals(5, warehouse.getProductQuantity("Product B"));
    }

    @Test
    public void testUpdateProductQuantity() {
        // Verifica si se actualiza correctamente la cantidad de un producto en el inventario
        warehouse.updateProductQuantity("Product A", 15);
        assertEquals(15, warehouse.getProductQuantity("Product A"));
    }
}
