package com.gflauta;

public class Main {

    public static void main(String[] args) {
	Dog Thor = new Dog("Thor", 20, 25, 1, 4, 2, 22, "short");

	Thor.eat();

	Sportscar lambo = new Sportscar(2, 0, 2, 750, "Lamborgini", "Centenario", "rear");
	lambo.racing();
	lambo.shiftGears(2);
	lambo.move(200);

    }
}
