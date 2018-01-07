package com.gflauta;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches = new ArrayList<Branch>();

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String name) {
        if (newBranch(name)) {
            addNewBranch(name);
            return true;
        }
        return false;
    }

    private boolean newBranch(String name) {
        for (int i = 0; i < branches.size(); i++) {
            if(branches.get(i).equals(name)) {
                return false;
            }
        }
        return true;
    }

    private void addNewBranch(String name) {
        branches.add(new Branch(name));
    }


}
