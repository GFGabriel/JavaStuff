package com.gflauta;

import java.util.ArrayList;

public class Branch {

    private String name;
    private ArrayList<Customer> customers = new ArrayList<Customer>();

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public boolean addCustomer(String name, double transactionAmount) {
        if(newCustomer(name)) {
            addNewCustomer(name, transactionAmount);
            return true;
        } else {
            return false;
        }
    }

    private boolean newCustomer(String name) {
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getName().equals(name)) {
                return false;
            }
        }
        return true;
    }

    private void addNewCustomer(String name, double transactionAmount) {
        Customer newCustomer = new Customer(name, transactionAmount);
    }
}
