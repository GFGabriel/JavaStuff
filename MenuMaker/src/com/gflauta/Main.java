package com.gflauta;

public class Main {

    public static void main(String[] args) {
        Burger burger = new Burger("Baconator", new Bun("Artisan Roll"), "beef", 3.45);

        burger.addExtra1("bacon", 1.50);
        System.out.println(burger.getName() + " costs " + burger.getPrice() + ".");

        HealthyBurger healthyBurger = new HealthyBurger("turkey", 5.45);
        healthyBurger.addExtra1("egg", 1.45);
        healthyBurger.addExtra5("tomato", .45);
        System.out.println(healthyBurger.getName() + " costs " + healthyBurger.getPrice() + ".");

        BurgerCombo combo = new BurgerCombo(9.95);

        combo.addExtra1("egg", .95);
    }
}
