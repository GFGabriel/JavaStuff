package com.gflauta;


import java.util.Arrays;
import java.util.Hashtable;

public class ShellSort {
    private int arraySize;
    private int[] theArray;

    public void sort() {
        System.out.println("running sort");
        int inner, outer, temp;
        int interval = 1;

        while(interval <= arraySize/3) {
            interval = interval * 3 + 1;
            System.out.println("First while");

            while(interval > 0) {
                System.out.println("Second while");
                for(outer = interval; outer < arraySize; outer++) {
                    temp = theArray[outer];
                    inner = outer;

                    while(inner > interval-1 && theArray[inner-interval] >= temp) {
                        System.out.println("Third while");
                        theArray[inner] = theArray[inner-interval];
                        inner -= interval;
                    }
                    theArray[inner] = temp;
                }
                interval = (interval-1)/3;
            }

        }
    }

    public ShellSort(int arraySize) {
        this.arraySize = arraySize;
        this.theArray = new int[arraySize];
        generateRandomArray();
    }

    private void generateRandomArray() {
        for(int i = 0; i<arraySize; i++) {
            theArray[i] = (int) (Math.random() *50);
        }
    }

    public static void main(String[] args) {
//        ShellSort theSort = new ShellSort(10);
//
//        System.out.println(Arrays.toString(theSort.theArray));
//
//        theSort.sort();
//
//        System.out.println("printing after sort");
//
//        System.out.println(Arrays.toString(theSort.theArray));

        Hashtable<String, Integer> wordTable = new Hashtable<String, Integer>();
        wordTable.put("hello", 1);
        System.out.println(wordTable.get("hello"));
        String varString = "hello";
        System.out.println(wordTable.containsKey(varString));
        wordTable.put(varString, wordTable.get(varString) + 1);
        System.out.println(wordTable.get("hello"));
        String string1 = "Hello darkness, my old friend. I've come to talk with you again. Because a vision softly creeping. Left its seeds while I was sleeping";
        String[] string1Array = string1.replaceAll("[^a-zA-Z ]", "").toLowerCase().split(" ");
        System.out.println(Arrays.toString(string1Array));
//        wordTable.remove();

    }



}

