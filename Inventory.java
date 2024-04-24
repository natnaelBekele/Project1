package com.Inventory;

import java.util.ArrayList;

class Inventory {
    private ArrayList<Product> products;

    public Inventory() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public Product getProductById(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    public void displayProducts() {
        for (Product product : products) {
            product.display();
            System.out.println();
        }
    }

    public void updateQuantity(int id, int quantity) {
        Product product = getProductById(id);
        if (product != null) {
            product.setQuantity(quantity);
        } else {
            System.out.println("Product not found.");
        }
    }
}