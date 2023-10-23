package org.example;

import java.util.ArrayList;

public class Receipt {
    private ArrayList<Product> itemsPurchased;
    private double totalCost;

    public Receipt(ArrayList<Product> itemsPurchased, double totalCost) {
        this.itemsPurchased = itemsPurchased;
        this.totalCost = totalCost;
    }

    public void printReceipt(){
        System.out.println("Receipt: ");

        for(Product product : itemsPurchased){
            System.out.println(product + " " + product.getPrice());
        }

        System.out.println("Total Amount: " + totalCost);

    }
}
