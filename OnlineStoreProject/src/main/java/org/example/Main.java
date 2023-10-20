package org.example;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            FileInputStream fis = new FileInputStream("src/main/resources/products.txt");
            Scanner fileInput = new Scanner(fis);

            ArrayList<org.example.Product> productList = new ArrayList<>(); // i have not clue why intellej populated org.example.product

            System.out.println("Welcome to our Online Store.");
            System.out.println("Please choose an option from the list below: ");
            System.out.println("1) Display Products");
            System.out.println("2) Display Cart");
            System.out.println("3) Exit");
            String userInput = scanner.nextLine();

            boolean isShopping = true;

            while (isShopping) {
                switch (fileInput) { // will need to fix this not sure what to put
                    case 1:
                        if (userInput.equalsIgnoreCase("1")) {

                            String input;
                            while(scanner.hasNextLine()){
                                input = scanner.nextLine();
                                System.out.println(input);
                            }

                            System.out.println("Would you like to search for an item?");
                            String option1 = scanner.nextLine();

                            if(option1.equalsIgnoreCase("yes")){
                                System.out.println("Enter product name, price or department please");
                                String lookingFor = scanner.nextLine();

                                searchName(lookingFor);
                                searchPrice(Double.parseDouble(lookingFor)); //price is double didn't know if that needed to be changed
                                searchDepartment(lookingFor);
                            }

                            System.out.println("Would you like to add an item to your cart?");
                            String option2 = scanner.nextLine();

                            if (option2.equalsIgnoreCase("yes")){
                                System.out.println("What item would you like to add? ");
                                String addItem = scanner.nextLine();

                                addItem();
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
                            }

                            System.out.println("Would you like to remove an item from the cart?");
                            String option4 = scanner.nextLine();

                            if(option4.equalsIgnoreCase("yes")){
                                removeItem();
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
            System.out.println("Let's try again . . . .");
        }

    }
}