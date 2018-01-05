package com.gflauta;

public class DeluxeBurger extends Burger{
    private double cost;


    public DeluxeBurger() {
        super(new Bun("Artisan Roll"), 2, 3, true, true, false, true, false, false, false);
    }

    @Override
    public double getCost() {
        return super.getCost() + 2.5;
    }
}
