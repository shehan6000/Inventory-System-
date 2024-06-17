package com.inventorysystem;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<Product> products;

    public Inventory() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public List<Product> getProducts() {
        return products;
    }

    public void saveToCSV(String filename) {
        try (PrintWriter writer = new PrintWriter(new File(filename))) {
            for (Product product : products) {
                writer.println(product);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void loadFromCSV(String filename) {
        products.clear();
        String line;
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                String name = parts[0];
                double price = Double.parseDouble(parts[1]);
                int quantity = Integer.parseInt(parts[2]);
                Product product = new Product(name, price, quantity);
                products.add(product);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
