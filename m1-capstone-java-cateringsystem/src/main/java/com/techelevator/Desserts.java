package com.techelevator;

public class Desserts extends MenuItem{

    public Desserts(String productDescription, double productPrice) {
        super(productDescription, productPrice);
    }

    @Override
    public String getProductCode() {
        return null;
    }
}
