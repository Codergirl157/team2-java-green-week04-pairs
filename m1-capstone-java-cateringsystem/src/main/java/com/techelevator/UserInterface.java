package com.techelevator;

import java.awt.*;
import java.sql.SQLOutput;
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
    private final Scanner myScanner = new Scanner(System.in);
    public String printsubMenu() {

        System.out.println("(1) Add money");
        System.out.println("(2) Select product");
        System.out.println("(3) Complete Transaction");
        System.out.println("\n");
        System.out.println("Please select a number from above");


        return scanner.nextLine();
    }
    public void printError (String msg) {
        System.out.println(msg);
    }
//print header productcode, productDescription, quantity and Price, outside for loop, only need it twice
    //items print on one line each
    public void printMenu(List<MenuItem> items) {
        System.out.println(String.format("%-20s","Product Code") + String.format("%-23s", "Description") + String.format("%-12s","Qty") + String.format("%-10s", "Price"));
        for (MenuItem item : items){
            System.out.println(String.format("%-20s", item.getProductCode()) + String.format("%-23s", item.getProductDescription()) + String.format("%-10s", "25") + String.format("%.2f", item.getProductPrice()));

        }


    }



}
