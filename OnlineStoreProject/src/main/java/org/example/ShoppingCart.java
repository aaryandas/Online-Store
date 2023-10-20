package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingCart {
    private int quantity;

    public ShoppingCart(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public class ShoppingCart {
        private ArrayList<product> shoppingCart;
        private Scanner scanner;

        public ShoppingCart() {
            shoppingCart = new ArrayList<>();
            scanner = new Scanner(System.in);
        }

        public void addToCart(Product product) {
            ShoppingCart.add(product);
            System.out.println(product.name + " added to the cart.");
        }

        public void removeFromCart() {
            System.out.println("Enter the name of the product to remove: ");
            String productName = scanner.nextLine();
            boolean removed = false;
            
        }
    }
}


