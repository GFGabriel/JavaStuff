package com.gflauta;

public class Main {

    public static void main(String[] args) {

	    Dimensions dimensions = new Dimensions(10, 20, 20);
	    Case pcCase = new Case("2122","Cooler Master", "850W", dimensions);
	    Monitor monitor = new Monitor("32WD", "Samsung", 32, new Resolution(1440, 900));
	    Motherboard motherboard = new Motherboard("GX770X", "ASUS", 8, 6, "v10.1.47");

	    PC pc = new PC(pcCase, monitor, motherboard);

		pc.turnOn();

		Printer singlePrinter = new Printer(false);
		Printer doublePrinter = new Printer(true);

		singlePrinter.refillToner();
		doublePrinter.refillToner();

		singlePrinter.printPage(7);
		doublePrinter.printPage(7);


    }
}
