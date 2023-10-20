package org.example;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileWriter;

public class Product {

    //products
    private String sku;
    private String productName;
    private Double price;

    private String department;

    public Product(String sku, String productName, Double price, String department) {
        this.sku = sku;
        this.productName = productName;
        this.price = price;
        this.department = department;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public static void displayAvailableProducts(Product[] products) {
        Scanner scanner = new Scanner(System.in);


    }

    private ArrayList<Product> productList;

    public Product(){
        this.productList = new ArrayList<>();

    }
    public void addProduct(Product product){
        productList.add(product);
    }
    public void searchName(String Name){

        for(Product product : productList){
            if(productName
        }


    }


}
