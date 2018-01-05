package com.gflauta;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
	    String inString = "the quick, brown fox!";
//
////        char[] inArray = inString.toCharArray();
        ArrayList<String> inArrayList = new ArrayList<String>(Arrays.asList(inString.split("")));
//
////
////	    for(int i = 0; i < inString.length(); i++) {
////            inArray[i] = inString.charAt(i);
////        }
//
////        for(int i = 0; i < inArrayList.size(); i++) {
////            System.out.println(inArrayList.get(i));
////        }
//        inArrayList.remove(1);
//        isPossible(inArrayList);

//        if (isPossible("the quick brown fox", "quitt now")) {
//            System.out.println("true");
//        } else {
//            System.out.println("false");
//        }
//
//        ArrayList<String> testArray = new ArrayList<String>(inArrayList);
//        System.out.println(testArray.size());
//        testArray.set(0, testArray.get(testArray.size()-2));
//        for (int i = 0; i < testArray.size(); i++) {
//            System.out.println(testArray.get(i));
//        }

//        System.out.println(reverseString("take a left, then right, then you've arrived"));

        int[] intArray = new int[]{1,1,2,3,3,4,5,6,6,7,8,9,10,11};
        System.out.println(arrayPairEqualsSum(intArray, 10));




    }


    private static boolean isPossible(String inString, String outString) {
        ArrayList<String> inArrayList = new ArrayList<String>(Arrays.asList(inString.split("")));
        ArrayList<String> outArrayList = new ArrayList<String>(Arrays.asList(outString.split("")));

        for(int i = 0; i < outArrayList.size(); i++) {
            String letter = outArrayList.get(i);
            if (!letter.equals(" ") || !Pattern.matches("\\p{Punct}", letter)) {
                int position = atIndex(letter, inArrayList);
                if (position >= 0) {
                    inArrayList.remove(position);
                } else {
                    return false;
                }
            }

        }
        return true;
    }

    private static int atIndex(String letter, ArrayList<String> arrayList) {
        for(int i = 0; i < arrayList.size(); i++) {
            if(arrayList.get(i).equals(letter)) {
                return i;
            }
        }
        return -1;
    }

    private static String reverseString(String string) {
        ArrayList<String> stringArrayList = new ArrayList<String>(Arrays.asList(string.split("")));
        ArrayList<String> tempArrayList = new ArrayList<String>(stringArrayList);
        ArrayList<String> resultArrayList = new ArrayList<String>(stringArrayList);
        System.out.println(resultArrayList);

        for (int i = 0; i < stringArrayList.size(); i++) {
            if(!Pattern.matches("\\p{Punct}", stringArrayList.get(i))) {
                while(lastIsPunctuation(tempArrayList)) {
                    tempArrayList.remove(tempArrayList.size()-1);
                }
                resultArrayList.set(i, tempArrayList.get(tempArrayList.size()-1));
                tempArrayList.remove(tempArrayList.size()-1);
            }
        }
        return arrayListToString(resultArrayList);
    }

    private static boolean lastIsPunctuation(ArrayList<String> arrayList) {
        if (Pattern.matches("\\p{Punct}", arrayList.get(arrayList.size()-1))) {
            return true;
        }
        return false;
    }

    private static String arrayListToString(ArrayList<String> arrayList) {
        System.out.println(arrayList);
        String result = "";
        for(int i = 0; i < arrayList.size(); i++) {
            result += arrayList.get(i);
        }
        return result;
    }

//    private static boolean arrayPairEqualsSum(int[] array, int sum) {
//        if(sum%2 != 0) {
//            return false;
//        }
//        int number = sum/2;
//        int count = 0;
//        for(int i = 0; i < array.length; i++) {
//            if (array[i] == number) {
//                count++;
//            }
//        }
//        return count >= 2;
//    }

    private static boolean arrayPairEqualsSum(int[] array, int sum) {
        int start = 0;
        int end = array.length-1;
        while(true) {
            if (start >= end) {
                return false;
            } else if (array[start] + array[end] == sum && array[start] == array[end]) {
                return true;
            } else if (array[start] + array[end] <= sum) {
                start++;
            } else {
                end--;
            }
        }
    }
}
