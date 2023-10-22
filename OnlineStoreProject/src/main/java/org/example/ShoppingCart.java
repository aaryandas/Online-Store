package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingCart {
    private int quantity;
    private ArrayList<Product> shoppingCart;
    private Scanner scanner;


    public ShoppingCart(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }


    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void removeFromCart() {
        System.out.println("Enter the name of the product to remove: ");
        String productName = scanner.nextLine();
        boolean removed = false;

        for (Product product : shoppingCart) {
            if (product.getProductName().equalsIgnoreCase(productName)) {
                shoppingCart.remove(product);
                System.out.println(product.getProductName() + " removed from the cart.");
                removed = true;
                break;

            }

             }
            if (!removed) {
            System.out.println("Product not found in the cart.");
            }
            else {
            System.out.println("Invalid command. Returning to the home screen.");
            System.exit(0);
        }


    }
}



