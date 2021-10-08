package com.techelevator;

public class Appetizers extends MenuItem{

    public Appetizers(String productDescription, double productPrice) {
        super(productDescription, productPrice);
    }

    @Override
    public String getProductCode() {
        return null;
    }
}
