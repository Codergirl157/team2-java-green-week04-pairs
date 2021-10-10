package com.techelevator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

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
