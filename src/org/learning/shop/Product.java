package org.learning.shop;

import java.util.Random;

public class Product {
    private int productCode;
    private String name;
    private String description;
    private double price;
    private int vat;

    public Product(String name, String description, double price, int vat) {
        Random random = new Random();
        productCode = random.nextInt(1, 9999);

        this.name = name;
        this.description = description;
        this.price = price;
        this.vat = vat;
    }

    // Getters
    public String getProductCode() {
        return String.format("%06d", productCode);
    }

    public String getName() {
        return name;
    }

    public String getFullName() {
        return String.format("%s - %s", productCode, name);
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public double getPriceWithVat() {
        return price + (price * vat / 100);
    }

    public int getVat() {
        return vat;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setVat(int vat) {
        this.vat = vat;
    }
}
