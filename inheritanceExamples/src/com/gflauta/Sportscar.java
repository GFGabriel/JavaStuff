package com.gflauta;

public class Sportscar extends Car {
    private String make;
    private String model;
    private String engineLocation;

    public Sportscar( int passengerSpace, int cargoSpace, int doors, int horsepower,  String make, String model, String engineLocation) {
        super(passengerSpace, cargoSpace, doors, horsepower, 4);
        this.make = make;
        this.model = model;
        this.engineLocation = engineLocation;
    }

    public void racing() {
        System.out.println("Starting to race!");
    }
}
