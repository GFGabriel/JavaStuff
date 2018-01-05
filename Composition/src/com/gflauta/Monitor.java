package com.gflauta;

public class Monitor {

    private String model;
    private String manufacurer;
    private int size;
    private Resolution nativeResolution;

    public Monitor(String model, String manufacurer, int size, Resolution nativeResolution) {
        this.model = model;
        this.manufacurer = manufacurer;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }

    public void drawPixel(int x, int y, String color) {
        System.out.println("Drawing pixel at " + x + ", " + y + " in color " + color);
    }

    public String getModel() {
        return model;
    }

    public String getManufacurer() {
        return manufacurer;
    }

    public int getSize() {
        return size;
    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }
}
