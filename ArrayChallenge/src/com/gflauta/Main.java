package com.gflauta;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] intArray = getIntegers(5);
        printIntArray(intArray);
        int[] selectionSortedArray = selectionSortIntArray(intArray);
        printIntArray(selectionSortedArray);
        int[] bubbleSortedArray = bubbleSortIntArray(intArray);
        printIntArray(bubbleSortedArray);

    }

    public static int[] getIntegers(int number) {
        int[] values = new int[number];
        System.out.println("Enter " + number + " different integers.");
        for(int i = 0; i < number; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static void printIntArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static int[] selectionSortIntArray(int[] array) {
        //Doesn't take into account multiples of the same int.

        int[] sortedArray = new int[array.length];
        int high = array[0];
        int prevHigh = 0;
        int low = array[0];

        for(int i = 0; i < array.length - 1; i++) {
            for(int j = 0; j < array.length; j++) {
                if (i == 0) {
                    if (j == array.length - 1) {
                        if(array[j] > high) {
                            high = array[j];
                        } else if( array[j] < low) {
                            low = array[j];
                        }
                        sortedArray[i] = high;
                        prevHigh = high;
                        high = low;
                    } else if(array[j] > high) {
                        high = array[j];
                    } else if(array[j] < low) {
                        low = array[j];
                    }
                } else {
                    if (j == array.length - 1) {
                        if(array[j] > high && array[j] < prevHigh) {
                            high = array[j];
                        }
                        sortedArray[i] = high;
                        prevHigh = high;
                        high = low;
                    } else if(array[j] > high && array[j] < prevHigh) {
                        high = array[j];
                    }
                }
            }

        }
        sortedArray[array.length -1] = low;
        return sortedArray;
    }

    public static int[] bubbleSortIntArray(int[] array) {
        int[] sortedArray = array;
        int temp;
        boolean flag = true;

        while(flag){
            flag = false;
            for(int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i+1]) {
                    temp = sortedArray[i+1];
                    sortedArray[i+1] = sortedArray[i];
                    sortedArray[i] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}
