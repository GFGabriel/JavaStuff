package com.gflauta;

public class Burger {

    private Bun bun;
    private int meatPatties;
    private int toppings;
    private boolean lettuce;
    private boolean cheese;
    private boolean bacon;
    private boolean tomato;
    private boolean egg;
    private boolean pickles;
    private boolean onion;
    private double cost;

    public Burger(Bun bun, int meatPatties, int toppings, boolean lettuce, boolean cheese, boolean bacon, boolean tomato, boolean egg, boolean pickles, boolean onion) {
        if (toppings > 6) {
            System.out.println("Invalid burger, too many toppings.");
        } else if(toppings > 4 && toppings <= 6) {
            new HealthyBurger(bun, mea);
        } else {
            this.bun = bun;
            this.meatPatties = meatPatties;
            this.toppings = toppings;
            this.lettuce = lettuce;
            this.cheese = cheese;
            this.bacon = bacon;
            this.tomato = tomato;
            this.egg = egg;
            this.pickles = pickles;
            this.onion = onion;
            this.cost = 0;
        }
    }

    public double getCost() {
        this.addItemCost();
        return this.cost;
    }

    private void addItemCost() {
        this.cost += 3.50 + this.meatPatties;

        if (this.cheese) {
            this.cost += 1;
        }

        if(this.bacon) {
            this.cost += 1.5;
        }

        if(this.egg) {
            this.cost += 1;
        }
    }

}
