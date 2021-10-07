package com.techelevator;

public class MenuItem {

    //create a private instance variable for 4 fields
    private String productCode;
    private String productDescription;
    private double productPrice;
    private int quantity;

    //explicit constructor
    public MenuItem(String productCode, String productDescription, double productPrice){
        this.productCode = productCode;
        this.productDescription = productDescription;
        this.productPrice = productPrice;

    }
    //getter/ setter

    public String getProductCode() {
        return productCode;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public double getProductPrice() {
        return productPrice;
    }
    //this will need to be accessed by other class

}
//                String [] fields = output.split("|");
//
//                String itemType = fields[0];
//                String productCode = fields [1];
//                String productName = fields[2];
//                double productPrice = Double.parseDouble(fields [3]);
