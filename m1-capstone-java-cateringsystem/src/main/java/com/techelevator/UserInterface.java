package com.techelevator;

import java.awt.*;
import java.util.List;
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner = new Scanner(System.in);

    public String printMenu(){

        System.out.println("\n*** Catering System Menu ***\n");
        System.out.println("(1) Display Catering Items");
        System.out.println("(2) Order");
        System.out.println("(3) Quit");

        System.out.println("\n");
        System.out.println("Please select a number from above");
        return scanner.nextLine();

    }
    public void printError (String msg) {
        System.out.println(msg);
    }

    public void printMenu(List<MenuItem> items) {
        for (MenuItem item : items){
            System.out.println(String.format("%-25s %s", "Product Code: ", item.getProductCode()));
            System.out.println(String.format("%-25s %s", "Product Description: ",item.getProductDescription()));
            System.out.println(String.format("%-25s $%s", "Price: ", String.format("%.2f", item.getProductPrice())));

        }



    }

}
