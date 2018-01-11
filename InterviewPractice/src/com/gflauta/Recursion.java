package com.gflauta;

public class Recursion {
    private  int triangularNumber(int number) {
        if(number == 1) {
            return 1;
        }
        return number + triangularNumber(number - 1);
    }

    private int factoralNumber(int number) {
        if(number==1) {
            return 1;
        }
        return number * factoralNumber(number-1);
    }

    private void mergeSort(int[] array, int start, int end) {
//        System.out.println("Starting new merge sort between " + start + " and " + end);
        int low = start;
        int high = end;
        if(low >= high) {
            return;
        }
        int middle = (low+high)/2;
        mergeSort(array, low, middle);
        mergeSort(array, middle+1, high);
        int endLow = middle;
        int startHigh = middle+1;
        System.out.println("start: " + start + " endLow: " + endLow + " startHigh: " + startHigh + " end: " + end + " low: " + low);
        while(start <= endLow && startHigh <= high) {

            if(array[low] < array[startHigh]) {
                System.out.println("Low: " + low);
                low++;
            } else {
                int temp = array[startHigh];
                for (int i = startHigh-1; i >= low; i--) {
                    array[i+1] = array[i];
                }
                array[low] = temp;

                low++;
                endLow++;
                startHigh++;
            }
//            startHigh++;
        }
        String arrayInString = "[";
        for (int j = 0; j<array.length; j++) {
            if(j<array.length-1) {
                arrayInString += array[j] + ",";
            } else {
                arrayInString += array[j] + "]";
            }
        }
        System.out.println(arrayInString);

    }


    public static void main(String[] args) {
        Recursion recursion = new Recursion();
        System.out.println(recursion.triangularNumber(15));
        System.out.println(recursion.factoralNumber(15));
        int[] intArray = new int[]{1,34,12,4,23,18,10,3};
//        int[] intArray = new int[]{1,3,2,4};
        recursion.mergeSort(intArray, 0, intArray.length-1);


    }
}
