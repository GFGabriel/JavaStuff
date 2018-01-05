package com.gflauta;

public class Car extends Vehicle {
    private int doors;
    private int horsepower;
    private int wheels;

    public Car(int passengerSpace, int cargoSpace, int doors, int horsepower, int wheels) {
        super("land", passengerSpace, cargoSpace);
        this.doors = doors;
        this.horsepower = horsepower;
        this.wheels = wheels;
    }

    public void steering(String direction) {
        System.out.println("Turning " + direction + ".");
    }

    public void shiftGears(int gear) {
        System.out.println("Shifting to gear " + gear + ".");
    }

    public int getDoors() {
        return doors;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public int getWheels() {
        return wheels;
    }
}
