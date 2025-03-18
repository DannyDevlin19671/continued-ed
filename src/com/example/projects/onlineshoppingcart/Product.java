package com.example.projects.onlineshoppingcart;

/**
 * @author danieldevlin
 * @date 17/03/2025
 * @project continued-ed
 */
class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() { return price; }

    @Override
    public String toString() {
        return name + " - $" + price;
    }
}
