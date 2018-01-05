package com.gflauta;

public class Vehicle {
    private String transportationMethod;
    private int passengerSpace;
    private int cargoSpace;

    public Vehicle(String transportationMethod, int passengerSpace, int cargoSpace) {
        this.transportationMethod = transportationMethod;
        this.passengerSpace = passengerSpace;
        this.cargoSpace = cargoSpace;
    }

    public String getTransportationMethod() {
        return transportationMethod;
    }

    public int getPassengerSpace() {
        return passengerSpace;
    }

    public int getCargoSpace() {
        return cargoSpace;
    }

    public void move(int speed) {
        System.out.println("Moving at " + speed + " speed!");
    }
}
