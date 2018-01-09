package com.gflauta;

import java.util.Queue;

public class ArrayStructures {

    private int[] array = new int[50];
    private int arraySize = 10;

    public static void  main(String[] args) {
        ArrayStructures newArray = new ArrayStructures();

        newArray.generateRandomArray();
//        newArray.printArray();
//        System.out.println(newArray.getValueAtIndex(3));
//        System.out.println(newArray.doesArrayContainThisValue(14));
//        newArray.deleteIndex(6);
//        newArray.printArray();
//        newArray.insertValue(33);
//        newArray.printArray();
//        System.out.println(newArray.linearSearchForValue(15));
//        newArray.bubbleSort();
//        newArray.selectionSort();
        newArray.insertionSort();
        newArray.printArray();

        System.out.println(newArray.binarySearch(14));
//        Queue<Integer> theQueue = new Queue<Integer>();
    }

    public void generateRandomArray(){
        for(int i = 0; i < arraySize; i++) {
            array[i] = (int) (Math.random() * 10) + 10;
        }
    }

    public void printArray() {
        System.out.println("----------");
        for (int i = 0; i < arraySize; i++) {
            System.out.println("| " + i + " | " + array[i] + " |");
            System.out.println("----------");
        }
    }

    public int getValueAtIndex(int index){
        if (index >= arraySize) {
            return 0;
        }
        return array[index];
    }

    public boolean doesArrayContainThisValue(int value){
        for (int i = 0; i < arraySize; i++) {
            if(array[i] == value) {
                return true;
            }
        }
        return false;
    }

    public void deleteIndex(int index) {
        if(index < 0 || index >= arraySize) {
            System.out.println("Index " + index + " not found.");
        } else {
            for(int i = index; i < arraySize - 1; i++) {
                array[i] = array[i+1];
            }
            arraySize--;
        }
    }

    public void insertValue(int value) {
        if(arraySize < 50) {
            array[arraySize] = value;
            arraySize++;
        } else {
            System.out.println("Cannot add, array size limit reached");
        }
    }

    public String linearSearchForValue(int value) {
        String foundAt = "";
        for(int i = 0; i < arraySize; i++) {
            if(array[i] == value) {
                foundAt += i + " ";
            }
        }
        if(foundAt.length() > 0) {
            return value + " found at indices " + foundAt + "in array.";
        }
        return "None found";
    }

    public void bubbleSort(){
        for(int i = arraySize -1; i > 1; i--) {
            for(int j = 0; j < i; j++) {
                if (array[j] > array[j+1]) {
                    swapAmounts(j, j+1);
                }
            }
        }
    }

    public void selectionSort() {
        for(int i = 0; i < arraySize; i++){
            int minimum = i;
            for (int j = i; j < arraySize; j++) {
                if (array[j] < array[minimum]) {
                    minimum = j;
                }
            }
            swapAmounts(i, minimum);
        }
    }

    private void swapAmounts(int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public void insertionSort(){
        for(int i = 1; i < arraySize; i++) {
            int j = i;
            int toInsert = array[i];
            while(j>0 && array[j-1] > toInsert) {
                array[j] = array[j-1];
                j--;
            }
            array[j] = toInsert;
        }
    }

    public boolean binarySearch(int value) {
        System.out.println("Running binarySearch()");
        if(value < array[0] || value > array[arraySize-1]) {
            System.out.println(value + " not found.");
            return false;
        }
        int lowIndex = 0;
        int highIndex= arraySize-1;
        while(lowIndex <= highIndex) {

            int middle = (highIndex - lowIndex)/2 + lowIndex;
            System.out.println("Low is " + lowIndex + ", high is " + highIndex + ", and middle is " + middle + ".");
            if (value < array[middle]) {
                highIndex = middle - 1;
            } else if(value > array[middle]) {
                lowIndex = middle + 1;
            } else {
                System.out.println(value + " found at index " + middle + ".");
                return true;
            }
        }
        System.out.println(value + " not found.");
        return false;
    }
}

