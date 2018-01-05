package com.gflauta;

public class Main {

    public static void main(String[] args) {
	    Burger order1 = new Burger(new Bun("Artisan Roll"), 3, 3, false, true, true, false, true, false, false);
        DeluxeBurger order2 = new DeluxeBurger();


        System.out.println(String.format("%.2f", order1.getCost()));
        System.out.println(String.format("%.2f", order2.getCost()));
    }
}
