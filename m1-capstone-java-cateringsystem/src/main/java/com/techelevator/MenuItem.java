package com.techelevator;

public abstract class  MenuItem {

    //create a private instance variable for 4 fields
    private String productCode;
    private String productDescription;
    private double productPrice;
    private int quantity;

    //explicit constructor
    public MenuItem( String productDescription, double productPrice){
        this.productDescription = productDescription;
        this.productPrice = productPrice;

    }
    //getter/ setter

    public abstract String getProductCode();

    public String getProductDescription() {
        return productDescription;
    }

    public double getProductPrice() {
        return productPrice;
    }
    //this will need to be accessed by other class

}
