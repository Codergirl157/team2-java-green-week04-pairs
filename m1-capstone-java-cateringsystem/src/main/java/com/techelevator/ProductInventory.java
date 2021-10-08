package com.techelevator;

import java.io.FileReader;
import java.util.*;




public class ProductInventory {

    private Map<String, MenuItem> inventory;

    //this constructor only gets called when someone creates it
    //we are init
    public ProductInventory(String inventoryFile) {
        ProductInventoryFileReader reader = new ProductInventoryFileReader(inventoryFile);
        inventory = reader.loadMenuItem();

    }

    //Return ALL items in the map as a list
    public List<MenuItem> retrieveListOfItems() {

        //create an arraylist to hold our list of homes
        List<MenuItem> menuItemList = new ArrayList<>();

        //get a list of keys
        Set<String> keys = inventory.keySet();

        //iterate through the set and get values out of Map, and put into our list
        for (String key : keys) {
            MenuItem menuItem = inventory.get(key);
            menuItemList.add(menuItem);

        }

        //return our arraylist
        return menuItemList;
    }

    public MenuItem searchMenuItemByProductCode(String productCode) {
        MenuItem item = inventory.get(productCode);
        return item;
    }
}
