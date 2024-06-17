package com.inventorysystem;

import java.util.Scanner;

public class Main {
    private static final String FILENAME = "inventory.csv";
    private static Inventory inventory = new Inventory();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to Inventory System!");

        inventory.loadFromCSV(FILENAME);

        while (true) {
            System.out.println("1. Add Product");
            System.out.println("2. Remove Product");
            System.out.println("3. List Products");
            System.out.println("4. Save Data to CSV");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    removeProduct();
                    break;
                case 3:
                    listProducts();
                    break;
                case 4:
                    inventory.saveToCSV(FILENAME);
                    System.out.println("Data saved to CSV successfully!");
                    break;
                case 5:
                    System.out.println("Exiting...");
                    inventory.saveToCSV(FILENAME);
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    private static void addProduct() {
        System.out.print("Enter product name: ");
        String name = scanner.next();
        System.out.print("Enter product price: ");
        double price = scanner.nextDouble();
        System.out.print("Enter product quantity: ");
        int quantity = scanner.nextInt();

        Product product = new Product(name, price, quantity);
        inventory.addProduct(product);

        System.out.println("Product added successfully!");
    }

    private static void removeProduct() {
        System.out.print("Enter product name to remove: ");
        String name = scanner.next();

        for (Product product : inventory.getProducts()) {
            if (product.getName().equals(name)) {
                inventory.removeProduct(product);
                System.out.println("Product removed successfully!");
                return;
            }
        }

        System.out.println("Product not found!");
    }

    private static void listProducts() {
        System.out.println("Products in inventory:");
        System.out.println("--------------------------------------------------");
        System.out.printf("%-20s %-10s %-10s\n", "Name", "Price", "Quantity");
        System.out.println("--------------------------------------------------");
        
        for (Product product : inventory.getProducts()) {
            System.out.printf("%-20s $%-10.2f %-10d\n", product.getName(), product.getPrice(), product.getQuantity());
        }

        System.out.println("--------------------------------------------------");
    }
}
