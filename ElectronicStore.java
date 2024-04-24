package com.Inventory;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ElectronicStore {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Electronic Store Inventory Management System!");

        while (true) {
            try {
                System.out.println("\n1. Add Product");
                System.out.println("2. Display Products");
                System.out.println("3. Update Quantity");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        scanner.nextLine();  // Consume newline
                        System.out.print("Enter ID: ");
                        int id = scanner.nextInt();
                        scanner.nextLine();  // Consume newline
                        System.out.print("Enter Name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter Brand: ");
                        String brand = scanner.nextLine();
                        System.out.print("Enter Category: ");
                        String category = scanner.nextLine();
                        System.out.print("Enter Price: ");
                        double price = scanner.nextDouble();
                        System.out.print("Enter Quantity: ");
                        int quantity = scanner.nextInt();

                        Product newProduct = new Product(id, name, brand, category, price, quantity);
                        inventory.addProduct(newProduct);
                        System.out.println("Product added successfully.");
                        break;
                    case 2:
                        System.out.println("Products in Inventory:");
                        inventory.displayProducts();
                        break;
                    case 3:
                        System.out.print("Enter ID of the product to update quantity: ");
                        int productId = scanner.nextInt();
                        System.out.print("Enter new quantity: ");
                        int newQuantity = scanner.nextInt();
                        inventory.updateQuantity(productId, newQuantity);
                        System.out.println("Quantity updated successfully.");
                        break;
                    case 4:
                        System.out.println("Exiting...");
                        scanner.close();
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a valid option.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.nextLine(); // Clear the input buffer
            } catch (NullPointerException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}