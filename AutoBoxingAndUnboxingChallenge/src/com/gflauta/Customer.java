package com.gflauta;

import java.util.ArrayList;

public class Customer {

    private ArrayList<Double> transactions = new ArrayList<Double>();
    private String name;

    public Customer(String name, double transactionAmount) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
        transactions.add(transactionAmount);
    }

    public String getName() {
        return name;
    }

    public void printTransactions(){
        for (int i = 0; i < transactions.size(); i++) {
            System.out.println(transactions.get(i));
        }
    }



}
