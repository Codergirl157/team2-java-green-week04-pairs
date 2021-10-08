package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class ProductInventoryFileReader {
    private Scanner scanner;

    public ProductInventoryFileReader(String fileName) {
        File inputFile = new File(fileName);
        try {
            scanner = new Scanner(inputFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Map<String, MenuItem> loadMenuItem() {

        //Create a map
        Map<String, MenuItem> Menus = new HashMap<>();

        //loop through reading in records from file, convert those into home objects and then  place in the map

        while (scanner.hasNextLine()) {
            String output = scanner.nextLine();
            String[] fields = output.split("\\|");

            String itemType = fields[0];
            String productCode = fields[1];
            String productDescription = fields[2];
            double productPrice = Double.parseDouble(fields[3]);

            //what holds our information from each line
            //class that creates objects(menu item)
        }

        return Menus;}


    }


//  String menu = String.format("%-20s" +  productCode.toString()  +"%20s" + productName + "%20s" + "Qty" + "$" + productPrice);
//                System.out.println(menu);

