package com.gflauta;

public class Neighbor {
    public String ownerName;
    public int houseNumber;

    public Neighbor next;
    public Neighbor previous;

    public Neighbor(String ownerName, int houseNumber) {
        this.houseNumber = houseNumber;
        this.ownerName = ownerName;
    }

    public void display(){
        System.out.println(ownerName + ": " + houseNumber);
    }

    public String toString() {
        return ownerName;
    }
}


