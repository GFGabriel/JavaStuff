package com.gflauta;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] intArray = getIntegers(5);
        System.out.println("The average of your numbers is " + averageIntArray(intArray) + ".");
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integers.\r");
        int[] values = new int[number];

        for (int i = 0; i < number; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static double averageIntArray(int[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum/array.length;
    }
}
