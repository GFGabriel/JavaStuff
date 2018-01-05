package com.gflauta;

public class BurgerCombo extends Burger{

    private String drink;
    private double drinkCost;
    private String fries;
    private double friesCost;

    public BurgerCombo(double price) {
        super("Combo", new Bun("Sesame Seed Roll"), "beef", price);
    }

    @Override
    public void addExtra1(String name, double price) {
        System.out.println("Cannot add extras to burge combor");
    }

    @Override
    public void addExtra2(String name, double price) {
        System.out.println("Cannot add extras to burger combo");
    }

    @Override
    public void addExtra3(String name, double price) {
        System.out.println("Cannot add extras to burger combo");
    }

    @Override
    public void addExtra4(String name, double price) {
        System.out.println("Cannot add extras to burger combo");
    }


}
