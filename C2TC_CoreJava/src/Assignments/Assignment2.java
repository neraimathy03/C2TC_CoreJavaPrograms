package Assignments;

import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product[] products = new Product[4];

        // Collect details for 4 products
        for (int i = 0; i < 4; i++) {
            System.out.println("Enter details for product " + (i + 1) + ":");
            System.out.print("Product Name: ");
            String productName = sc.nextLine();
            System.out.print("Product ID: ");
            int productId = sc.nextInt();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            sc.nextLine();  // Clear newline buffer

            products[i] = new Product(productName, productId, price);
        }

        // Display details
        System.out.println("\nProduct Details:");
        for (Product p : products) {
            p.display();
        }

        sc.close();
    }
}

// 👉 Inner class (not public)
class Product {
    String name;
    int id;
    double price;

    public Product(String name, int id, double price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Price: " + price);
        System.out.println("----------------------");
    }
}

