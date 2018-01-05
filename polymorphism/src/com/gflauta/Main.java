package com.gflauta;

class Car {

    private boolean engine;
    private int cylinders;
    private int wheels;
    private String name;

    public Car(int cylinders, String name) {
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.name = name;
    }

    public boolean hasEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public String getName() {
        return name;
    }

    public void startEngine() {
        System.out.println("Engine is started.");
    }

    public String accelerate() {
        return "Going faster!";
    }

    public void brake() {
        System.out.println("Slowing down.");
    }
}

class Lambo extends Car {
    public Lambo() {
        super(8, "Lamborghini");
    }

    @Override
    public String accelerate() {
        return "Going really, really fast!!!";
    }
}

class Tank extends Car {
    public Tank() {
        super(16, "Tank");
    }

    @Override
    public void brake() {
        System.out.println("Trying to slow down!!");
    }
}

class Hoopdie extends Car {
    public Hoopdie() {
        super(6, "Hoopdie");
    }

    @Override
    public void startEngine() {
        System.out.println("I turn the engine, but the engine doesn't turn.");
    }

    public String accelerate() {
        return "This car does not appear to work.";
    }
}

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Car car = randomCar();
            System.out.println("Car is " + car.getName() + "." +  "\n" + car.accelerate());
        }


	// write your code here
    }

    public static Car randomCar() {
        int randomNumber = (int) (Math.random()*3 + 1);
        System.out.println("Random number is " + randomNumber + ".");
        switch (randomNumber){
            case 1:
                return new Lambo();
            case 2:
                return new Tank();
            case 3:
                return new Hoopdie();
        }
        return null;
    }
}
