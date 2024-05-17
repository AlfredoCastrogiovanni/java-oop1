package org.learning.shop;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Hamburger", "juice hamburger", 4.99, 10);

        System.out.println(product1.getFullName());
        System.out.println(product1.getProductCode());
    }
}
