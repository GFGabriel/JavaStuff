package com.gflauta;

public class PC {
    private Case pcCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case pcCase, Monitor monitor, Motherboard motherboard) {
        this.pcCase = pcCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void turnOn() {
        pcCase.pressPowerButton();
        motherboard.loadProgram("Windows 10");
        drawLogo();
    }

    public void drawLogo() {
        monitor.drawPixel(100, 890, "green");
    }
}