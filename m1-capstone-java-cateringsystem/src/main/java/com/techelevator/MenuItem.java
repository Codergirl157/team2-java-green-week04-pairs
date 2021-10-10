package com.techelevator;

public abstract class  MenuItem {

    //create a private instance variable for 4 fields
    private String productCode;
    private String productDescription;
    private double productPrice;
    private int quantity = 25;

    public int getQuantity() {
        return quantity;
    }

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
    //can't use MenuItem because abstract, use file reader A, B, D, E

//   productCode,productDescription,quantity,productPrice

}
