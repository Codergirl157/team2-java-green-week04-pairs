package com.techelevator;

public class BalanceAccount {

    private double accountBalance = 0.00;



    public double getAccountBalance() {
        return accountBalance;
    }

    public double addMoney(double moneyAdded) {

        if (accountBalance + moneyAdded <= 1000) {

            accountBalance += moneyAdded;

        }
        return accountBalance;
    }
}
