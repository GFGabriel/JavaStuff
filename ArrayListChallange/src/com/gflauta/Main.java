package com.gflauta;

import java.util.Scanner;

public class Main {

    private static MobilePhone newPhone = new MobilePhone();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	    boolean flag = true;

	    printInstructions();
	    while(flag) {
            System.out.println("Enter a number choice:");
            switch(scanner.nextInt()) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    newPhone.printContactsList();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    searchContacts();
                    break;
                case 6:
                    System.out.println("Quitting.");
                    flag = false;
                    break;
                default:
                    System.out.println("Option not found.");
                    printInstructions();
                    break;
            }

        }

    }

    private static void printInstructions(){
        System.out.println("\nPress:");
        System.out.println("\t0 - to repeat instructions.");
        System.out.println("\t1 - to see all contacts.");
        System.out.println("\t2 - to add a contact.");
        System.out.println("\t3 - to edit a contact by contact name.");
        System.out.println("\t4 - to remove a contact by contact name.");
        System.out.println("\t5 - to search for a contact by name.");
        System.out.println("\t6 - to exit out of menu.");
    }

    private static void addNewContact() {
        System.out.println("Please enter name contact:");
        String name = scanner.next();
        System.out.println("Please enter a phone number for " + name);
        String number = scanner.next();
        newPhone.addContact(name, number);
    }

    private static void updateContact() {
        System.out.println(("Please enter name to edit:"));
        String name = scanner.next();
        System.out.println("Searching for contact " + name + "...");
        if(newPhone.onList(name)) {
            System.out.println("Contact found!");
            System.out.println("Please enter new name:");
            String newName = scanner.next();
            System.out.println("Please enter new number:");
            String newNumber = scanner.next();
            newPhone.modifyContact(name, newName, newNumber);
        } else {
            System.out.println("Name not found.");
        }
        System.out.println("Contact updated.");
    }

    private static void removeContact() {
        System.out.println("Please enter name to remove:");
        String name = scanner.next();
        System.out.println("Searching for contact " + name + "...");
        if(newPhone.onList(name)) {
            System.out.println("Contact found!");
            newPhone.removeContact(name);
        } else {
            System.out.println("Name not found.");
        }
        System.out.println("Contact deleted.");
    }

    private static void searchContacts() {
        System.out.println("Please enter name to search:");
        String name = scanner.next();
        if(newPhone.onList(name)) {
            System.out.println("Contact found!");
            newPhone.printContact(name);
        } else {
            System.out.println("Name not found.");
        }
    }
}
