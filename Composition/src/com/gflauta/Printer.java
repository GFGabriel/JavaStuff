package com.gflauta;

public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplexPrinter;

    public Printer(boolean duplexPrinter) {
        this.tonerLevel = 0;
        this.pagesPrinted = 0;
        this.duplexPrinter = duplexPrinter;
    }

    public void refillToner() {
        this.tonerLevel = 100;
        System.out.println("Toner refilled");
    }

    public void printPage(int pages) {
        if(duplexPrinter) {
            if(pages%2 == 0) {
                this.pagesPrinted += pages/2;
                System.out.println("Printed " + pages/2 + " pages.");
            } else {
                this.pagesPrinted += (pages/2 + 1);
                System.out.println("Printed " + (pages/2 + 1) + " pages.");
            }

        } else {
            this.pagesPrinted += pages;
            System.out.println("Printed " + pages + " pages.");

        }
        this.tonerLevel -= pages;
        System.out.println("Toner at " + this.tonerLevel + "%");
    }
}
