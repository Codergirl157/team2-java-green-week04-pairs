package com.techelevator;

public class Entrees extends MenuItem{

    public Entrees(String productDescription, double productPrice) {
        super(productDescription, productPrice);
    }

    @Override
    public String getProductCode() {
        return null;
    }
}
