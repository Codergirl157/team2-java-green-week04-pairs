package com.techelevator;

import java.io.FileReader;
import java.util.*;




public class ProductInventory {

    private Map<String, MenuItem> ProductInventory;

    //this constructor only gets called when someone creates it
    //we are init
    public ProductInventory(String inventoryFile) {
        ProductInventoryFileReader reader = new ProductInventoryFileReader(inventoryFile);
        ProductInventory = reader.loadMenuItem();

    }

    //Return ALL items in the map as a list
    public List<MenuItem> retrieveListOfItems() {

        //create an arraylist to hold our list of homes
        List<MenuItem> menuItemList = new ArrayList<>();

        //get a list of keys
        Set<String> keys = ProductInventory.keySet();

        //iterate through the set and get values out of Map, and put into our list
        for (String key : keys) {
            MenuItem menuItem = ProductInventory.get(key);
            menuItemList.add(menuItem);
            // OPTION 2 on one line... listOfHomes.add(inventory.get(key));
        }

        //return our arraylist
        return menuItemList;
    }
}
