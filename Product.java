package com.Inventory;
class Product {
    private int id;
    private String name;
    private String brand;
    private String category;
    private double price;
    private int quantity;

    public Product(int id, String name, String brand, String category, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Brand: " + brand);
        System.out.println("Category: " + category);
        System.out.println("Price: $" + price);
        System.out.println("Quantity: " + quantity);
    }
}