package com.gflauta;

import java.util.ArrayList;

public class GroceryList {

    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items on your list.");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(String name, String newItem) {
        int position = findItem(name);
        if (position >= 0) {
            modifyGroceryItem(position, newItem);
        }
    }

    private void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery list item " + (position+1) + " has been modified.");
    }

    public void removeGroceryItem(String itemName) {
        int position = findItem(itemName);
        if (position >= 0) {
            removeGroceryItem(position);
        }
    }

    private void removeGroceryItem(int position) {
        String itemRemoved = groceryList.get(position);
        groceryList.remove(position);
        System.out.println("Removed " + itemRemoved);
    }

    private int findItem(String itemName) {
        int position = groceryList.indexOf(itemName);
        return position;
    }

    public boolean onFile(String itemName) {
        int position = findItem(itemName);
        if (position >= 0) {
            return true;
        }
        return false;
    }
}
