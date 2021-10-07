package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ProductInventory {

    String cateringSystem = "C:\\Users\\Student\\source\\repos\\pairs\\team2-java-green-week04-pairs\\m1-capstone-java-cateringsystem\\cateringsystem.csv";

    File cateringMenu = new File(cateringSystem);

    Scanner ourScanner;
    {
        try {
            ourScanner = new Scanner(cateringMenu);


            while(ourScanner.hasNextLine()){
                String output = ourScanner.nextLine();
                System.out.println(output);
                //what holds our information from each line
                //class that creates objects(menu item)
            }
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }

    }

    //how do we put this information into a loop
    //example in jghomes (to pull info out a string, using setters, put in instance of menu type we create
}


//  String menu = String.format("%-20s" +  productCode.toString()  +"%20s" + productName + "%20s" + "Qty" + "$" + productPrice);
//                System.out.println(menu);

