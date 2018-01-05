package com.gflauta;

public class Burger {

    private String name;
    private Bun bun;
    private String meat;
    private double price;

    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;

    public Burger(String name, Bun bun, String meat, double price) {
        this.name = name;
        this.bun = bun;
        this.meat = meat;
        this.price = price;
    }



    public String getName() {
        return name;
    }

    public Bun getBun() {
        return bun;
    }

    public String getMeat() {
        return meat;
    }

    public double getPrice() {
        return price;
    }

    public void addExtra1(String name, double price) {
        System.out.println("Added " + name + " for " + String.format("%.2f", price) + ".");
        this.addition1Name = name;
        this.price += price;
    }

    public void addExtra2(String name, double price) {
        System.out.println("Added " + name + " for " + String.format("%.2f", price) + ".");
        this.addition1Name = name;
        this.price += price;
    }

    public void addExtra3(String name, double price) {
        System.out.println("Added " + name + " for " + String.format("%.2f", price) + ".");
        this.addition1Name = name;
        this.price += price;
    }

    public void addExtra4(String name, double price) {
        System.out.println("Added " + name + " for " + String.format("%.2f", price) + ".");
        this.addition1Name = name;
        this.price += price;
    }

}
