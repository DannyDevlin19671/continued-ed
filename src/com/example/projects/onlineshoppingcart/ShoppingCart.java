package com.example.projects.onlineshoppingcart;

import java.util.ArrayList;
import java.util.List;

/**
 * @author danieldevlin
 * @date 17/03/2025
 * @project continued-ed
 */
class ShoppingCart<T> {
    private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public void removeItem(T item) {
        items.remove(item);
    }

    public double getTotalPrice() {
        return items.stream()
                .mapToDouble(item -> ((Product) item).getPrice())
                .sum();
    }

    public void displayItems() {
        items.forEach(System.out::println);
    }
}
