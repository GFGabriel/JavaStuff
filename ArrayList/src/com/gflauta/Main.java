package com.gflauta;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while(!quit) {
            System.out.println("Enter a choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;
                default:
                    processArrayList();
                    break;
            }
        }
    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t0 - to print options.");
        System.out.println("\t1 - to print grocery list.");
        System.out.println("\t2 - to add an item.");
        System.out.println("\t3 - to modify an item.");
        System.out.println("\t4 - to remove an item.");
        System.out.println("\t5 - to search for an item");
        System.out.println("\t6 - to quit the application.");
    }

    public static void addItem() {
        System.out.println("Enter item to add to list:");
        groceryList.addGroceryItem(scanner.nextLine());
        groceryList.printGroceryList();
    }

    public static void modifyItem() {
        System.out.println("Enter the item you would like to change:");
        String currentItem = scanner.nextLine();
        System.out.println("Enter the new item:");
        String itemName = scanner.next();
        groceryList.modifyGroceryItem(currentItem, itemName);
    }

    public static void removeItem() {
        System.out.println("Enter the item number you would like to delete:");
        groceryList.removeGroceryItem(scanner.nextLine());
    }

    public static void searchForItem() {
        // Needs refactoring to handle case differences
        System.out.println("Enter search item:");
        boolean present = groceryList.onFile(scanner.nextLine());
        if (!present) {
            System.out.println("Item not found");
        } else {
            System.out.println("Found item");
        }
    }

    public static void processArrayList() {
        ArrayList<String> newArray = new ArrayList<String>();
        newArray.addAll(groceryList.getGroceryList());
        System.out.println(newArray);

        ArrayList<String> nextArray = new ArrayList<String>(groceryList.getGroceryList());
        System.out.println(nextArray);

        String[] myArray = new String[groceryList.getGroceryList().size()];
        myArray = groceryList.getGroceryList().toArray(myArray);
        System.out.println(myArray);
    }

}
