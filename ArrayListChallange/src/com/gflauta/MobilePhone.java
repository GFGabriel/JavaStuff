package com.gflauta;

import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contacts> contactList = new ArrayList<Contacts>();

    public void addContact(String name, String number) {
        int position = findContact(name);
        if(position < 0) {
            contactList.add(new Contacts(name, number));
        }
    }

    private int findContact(String name) {
        int position = -1;
        for (int i = 0; i < contactList.size(); i++) {
            if(contactList.get(i).getName().equals(name)) {
                return i;
            }
        }
        return position;
    }

    private void printContact(int position) {
        System.out.println("Name: " + contactList.get(position).getName() + " Number: " + contactList.get(position).getNumber());
    }

    public void printContact(String name) {
        int position = findContact(name);
        if (position >= 0) {
            printContact(position);
        } else {
            System.out.println("Contact not found.");
        }
    }

    public void printContactsList() {
        System.out.println("You have " + contactList.size() + " contacts.");
        for(int i = 0; i < contactList.size(); i++) {

            System.out.println("Name: " + contactList.get(i).getName() + " Number: " + contactList.get(i).getNumber());
        }
    }

    public void modifyContact(String name, String newName, String newNumber) {
        int position = findContact(name);
        if (position >= 0) {
            modifyContact(position, newName, newNumber);
        } else {
            System.out.println("Contact not found.");
        }

    }

    private void modifyContact(int position, String newName, String newNumber) {
        contactList.set(position, new Contacts(newName, newNumber));
    }

    public void removeContact(String name) {
        int position = findContact(name);
        if (position >= 0) {
            removeContact(position);
        } else {
            System.out.println("Contact not found.");
        }
    }

    private void removeContact(int position) {
        contactList.remove(position);
    }

    public boolean onList(String name) {
        int position = findContact(name);
        if (position >= 0) {
            return true;
        }
        return false;
    }

}
