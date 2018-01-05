package com.gflauta;

public class Dog extends Animal {

    private int tail;
    private int legs;
    private int eyes;
    private int teeth;
    private String coat;


    public Dog(String name, int size, int weight, int tail, int legs, int eyes, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.tail = tail;
        this.legs = legs;
        this.eyes = eyes;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew() {
        System.out.println("Dog.chew() called");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        this.chew();
        super.eat();
    }
}
