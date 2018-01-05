package com.gflauta;

public class HealthyBurger extends Burger{

    private double price;
    private String addition5Name;
    private double addition5Price;
    private String addition6Name;
    private double addition6Price;


    public HealthyBurger(String meat, double price) {
        super("Healthy Burger", new Bun("Brown Rye Roll"), meat, price);
    }

    public void addExtra5(String name, double price) {
        System.out.println("Added " + name + " for " + String.format("%.2f", price) + ".");
        this.addition5Name = name;
        this.price += price;
    }

    public void addExtra6(String name, double price) {
        System.out.println("Added " + name + " for " + String.format("%.2f", price) + ".");
        this.addition6Name = name;
        this.price += price;
    }
}
