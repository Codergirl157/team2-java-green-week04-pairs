package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


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
        Map<String, MenuItem> items = new HashMap<>();

        //loop through reading in records from file, convert those into home objects and then  place in the map

        while (scanner.hasNextLine()) {
            String output = scanner.nextLine();
            String[] fields = output.split("\\|");

            String itemType = fields[0];
            String productCode = fields[1];
            String productDescription = fields[2];
            double productPrice = Double.parseDouble(fields[3]);

            //create an object to put it in menu item

            MenuItem item = null;
            if (itemType.equals("A")) {
                //create a new appetizer menuItem
                item = new Appetizers(productCode,productDescription,productPrice);
            }
            else if (itemType.equals("B")) {
                //create a new beverage menuItem
                item = new Beverages(productCode,productDescription,productPrice);
            }
            else if (itemType.equals("D")) {
                //create a new dessert menuItem
                item = new Desserts(productCode, productDescription, productPrice);
            }
            else {
                item = new Entrees(productCode,productDescription,productPrice);
            }

            items.put(productCode, item);

        }
        //field 1, and generic object

        return items;
        //18 items total
    }


}

//create a new appetizer menuItem

//putting it in the Map collection of menuitems
//use A, B, D, E if statement

//what holds our information from each line
//class that creates objects(menu item)
//  String menu = String.format("%-20s" +  productCode.toString()  +"%20s" + productName + "%20s" + "Qty" + "$" + productPrice);
//                System.out.println(menu);

