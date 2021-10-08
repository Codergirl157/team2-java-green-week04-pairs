package com.techelevator;

public class Beverages extends MenuItem{

    public Beverages(String productDescription, double productPrice) {
        super(productDescription, productPrice);
    }

    @Override
    public String getProductCode() {
        return null;
    }
}
