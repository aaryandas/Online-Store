package org.example;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            ArrayList<Product> productList = new ArrayList<>();

            System.out.println("Welcome to our Online Store.");
            boolean isShopping = true;

            System.out.println("Please choose an option from the list below: ");
            System.out.println("1) Display Products");
            System.out.println("2) Display Cart");
            System.out.println("3) Exit");
            String userInput = scanner.nextLine();


            while (isShopping) {
                switch (userInput) { // will need to fix this not sure what to put
                    case 1:
                        if (userInput.equalsIgnoreCase("1")) {

                            displayProducts();

                            System.out.println("Would you like to search for an item?");
                            String option1 = scanner.nextLine();

                            if(option1.equalsIgnoreCase("yes")){
                                searchItems(productList);
                            }

                            System.out.println("Would you like to add an item to your cart?");
                            String option2 = scanner.nextLine();

                            if (option2.equalsIgnoreCase("yes")){
                                System.out.println("What item would you like to add? ");
                                String addItem = scanner.nextLine();

                                addItem();
                                addToCart();
                            }

                        } else {
                            System.out.println("Returning Home");
                            isShopping = false;
                        }
                        break;

                    case 2:
                        if (userInput.equalsIgnoreCase("2")) {
                            System.out.println("Would you like to check out?");
                            String option3 = scanner.nextLine();

                            if(option3.equalsIgnoreCase("yes")){
                                checkOut();

                                System.out.println("Here is your receipt: ");
                                printReceipt();
                            }

                            System.out.println("Would you like to remove an item from the cart?");
                            String option4 = scanner.nextLine();

                            if(option4.equalsIgnoreCase("yes")){

                                removeFromCart();
                            }

                        } else {
                            System.out.println("Returning Home");
                            isShopping = false;
                        }
                        break;

                    case 3:
                        if (userInput.equalsIgnoreCase("3")) {
                            System.out.println("Thank you and Goodbye . . . . .");
                        }
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Please select a valid option");

                }
            }

        }
        catch(Exception ex){
            System.out.println("Please select a valid option");
        }

    }

    public static void displayProducts(){
        try{
            FileInputStream fis = new FileInputStream("src/main/resources/Products.txt");
            Scanner fileInput = new Scanner(fis);

            String input;
            while(fileInput.hasNextLine()){
                input = fileInput.nextLine();
                System.out.println(input);
            }
        }
        catch(Exception ex){
            System.out.println("Unable to display item");
        }
    }

    static Scanner scanner = new Scanner(System.in);
    public static void searchItems(ArrayList<Product> productList){
        System.out.println("Enter product name, price or department please");
        String lookingFor = scanner.nextLine();

        for(Product p : productList){
            p.searchName(lookingFor);
            p.searchPrice(Double.parseDouble(lookingFor)); //price is double didn't know if that needed to be changed
            p.searchDepartment(lookingFor);
        }

    }

    public static void addItem(){
        try{
            FileWriter cartWriter = new FileWriter("src/main/resources/Products.txt", true);
            Product product = new Product();

            cartWriter.write(product.getProductName() + "|" + product.getPrice() + "|" + product.getDepartment() + "\n");
            cartWriter.close();
        }
        catch(Exception ex){
            System.out.println("Unable to add item");
        }
    }

    public static void checkOut(){
    }

    public static void addToCart(){
        
    }
}