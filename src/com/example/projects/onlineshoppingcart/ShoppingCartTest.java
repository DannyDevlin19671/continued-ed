package com.example.projects.onlineshoppingcart;

/**
 * @author danieldevlin
 * @date 17/03/2025
 * @project continued-ed
 */
public class ShoppingCartTest {
    public static void main(String[] args) {
        ShoppingCart<Product> cart = new ShoppingCart<>();

        Product p1 = new Product("Laptop", 999.99);
        Product p2 = new Product("Mouse", 25.99);

        cart.addItem(p1);
        cart.addItem(p2);

        System.out.println("Cart Items:");
        cart.displayItems();
        System.out.println("Total: $" + cart.getTotalPrice());
    }
}
