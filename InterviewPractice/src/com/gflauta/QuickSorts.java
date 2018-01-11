package com.gflauta;

import java.util.Arrays;

public class QuickSorts {
    private int[] array;
    private int arraySize;

    public static void main(String[] args) {
        QuickSorts array = new QuickSorts(10);
        array.generateRandomArray();
        System.out.println(Arrays.toString(array.array));
//        array.partitionArray(0, array.arraySize-1, 35);
//        System.out.println(Arrays.toString(array.array));
        array.quickSort(0, array.arraySize-1);
        System.out.println(Arrays.toString(array.array));
    }



    public int partitionArray(int left, int right, int pivot) {
        int leftPointer = left - 1;
        int rightPointer = right;
        System.out.println(Arrays.toString(array));
        System.out.println("partitioning on leftPointer: " + leftPointer + " rightPointer: " + rightPointer + " pivot: " + pivot);

        while(true) {
            while(array[++leftPointer] < pivot )
                System.out.println("while leftpointer = " + leftPointer);

            while(rightPointer > 0 && array[--rightPointer] > pivot)
                System.out.println("while rightpointer = " + rightPointer);

            System.out.println("Found leftPointer: " + leftPointer + " and rightPointer: " + rightPointer);
            if(leftPointer > rightPointer) {
                System.out.println("crossed over, breaking");
                break;
            } else {
                int temp = array[rightPointer];
                array[rightPointer] = array[leftPointer];
                array[leftPointer] = temp;
                System.out.println("swapping");
                System.out.println(Arrays.toString(array));
            }
        }
        System.out.println("final swap");
        int temp = array[right];
        array[right] = array[leftPointer];
        array[leftPointer] = temp;
        System.out.println(Arrays.toString(array));
        System.out.println("leftPointer = " + leftPointer + " right = " + right);
        return leftPointer;
    }

    public QuickSorts(int arraySize) {
        this.array = new int[arraySize];
        this.arraySize = arraySize;
        generateRandomArray();
    }

    private void generateRandomArray() {
        for(int i = 0; i<arraySize; i++) {
            array[i] = (int) (Math.random() *50);
        }
    }

    public void quickSort(int left, int right) {
        if (right - left <= 0) {
            return;
        } else {
            int pivot = array[right];
            System.out.println(pivot);
            int pivotLocation = partitionArray(left, right, pivot);
            System.out.println(pivotLocation);
            quickSort(left, pivotLocation-1);
            quickSort(pivotLocation + 1, right);
        }
    }
}
