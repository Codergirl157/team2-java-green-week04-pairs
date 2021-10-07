package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;

public class ProductInventory {

    String cateringSystem = "C:\\Users\\Student\\source\\repos\\pairs\\team2-java-green-week04-pairs\\m1-capstone-java-cateringsystem\\cateringsystem.csv";

   File cateringMenu = new File(cateringSystem);

   Scanner ourScanner;

    {
        try {
            ourScanner = new Scanner(cateringMenu);

            while(ourScanner.hasNext()) {
                 String output = ourScanner.nextLine();

                System.out.println(output);
            }





        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


}
