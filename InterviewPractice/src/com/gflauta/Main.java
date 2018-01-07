package com.gflauta;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Hashtable;

public class Main {

    public static void main(String[] args) {
        // given an array of chars, return the first duplicate, with 0(n)
        char[] charArray1 = new char[]{'a', 'b', 'c'};
        char[] charArray2 = new char[]{'b', 'a', 'b', 'c'};
        char[] charArray3 = new char[]{'b', 'a', 'c', 'a', 'b'};
        System.out.println(findDuplicateCharInArray(charArray1));
        System.out.println(findDuplicateCharInArray(charArray2));
        System.out.println(findDuplicateCharInArray(charArray3));

        // given an array of ints and a sum, return whether a pair of ints equal the sum, with 0(n)
        int[] intArray = new int[]{1,2,4,7,12,34,18,23,6,8,3,19,13,47};
        System.out.println(canIntsInArrayMakeSum(intArray, 36));
        System.out.println(canIntsInArrayMakeSum(intArray, 55));
        System.out.println(canIntsInArrayMakeSum(intArray, 100));

        // given an array, return a randomized array
        int[] smallIntArray = new int[]{1,2,3,4};
        System.out.println(Arrays.toString(randomizeIntArray(smallIntArray)));

        // given a string return a hashtable with the character that has the highest consecutive character count and the number of times it appears
        String string = "ABBACA";
        System.out.println(mostConsecutiveChars(string).toString());

        // given an int array, where each int represents the max number of spaces you can move, return a boolean of whether you can escape the array
        System.out.println(isEscapable(new int[]{3,3,0,3,3,0,0}));
        System.out.println(isEscapeableFaster(new int[]{3,3,0,3,3,0,0}));

        // given an array and sum find the number of subsets within the array will total the given sum
        System.out.println(findNumberOfSubsets(new int[]{1,3,4,6,7,8,10}, 10));
        System.out.println(findNumberOfSubsets(new int[]{1,2,3,4,5,6}, 0));

    }

    private static char findDuplicateCharInArray(char[] array) {
        HashSet<Character> set = new HashSet<Character>();

        for (int i = 0; i < array.length; i++) {
            if(!set.add(array[i])) {
                return array[i];
            }
        }
        return '\0';
    }

    private static boolean canIntsInArrayMakeSum(int[] array, int sum) {
        HashSet<Integer> set = new HashSet<Integer>();

        for(int i = 0; i < array.length; i++) {
            if(set.contains(array[i])) {
                return true;
            } else {
                set.add(sum - array[i]);
            }
        }
        return false;
    }


    private static int[] randomizeIntArray(int[] array) {
        int temp;
        for(int i = 0; i < array.length; i++) {
            int rand = getRandomNumber(array.length);
            temp = array[i];
            array[i] = array[rand];
            array[rand] = temp;
        }
        return array;
    }

    private static int getRandomNumber(int max) {
        return ((int) Math.floor(Math.random() * max));
    }

    private static Hashtable mostConsecutiveChars(String string) {
        Hashtable hashTable = new Hashtable();

        if (string.length() < 1) {
            return hashTable;
        }
        if (string.length() == 1) {
            hashTable.put(string.charAt(0), 1);
            return hashTable;
        }

        int currentCount = 1;
        int maxCount = 0;
        char prevChar = string.charAt(0);
        char maxChar = '\0';

        for (int i = 1; i < string.length(); i++) {
            if(string.charAt(i) == prevChar) {
                currentCount++;
            } else {
                if(currentCount > maxCount) {
                    maxCount = currentCount;
                    maxChar = string.charAt(i-1);
                }
                currentCount = 1;
                prevChar = string.charAt(i);
            }
        }
        hashTable.put(maxChar, maxCount);
        return hashTable;
    }

    private static boolean isEscapable(int[] array) {
        HashSet<Integer> set = new HashSet<Integer>();
        int out = array.length;

        for(int i = out-1; i >= 0; i--) {
            if(array[i] == 0) {
                continue;
            }
            if (array[i] + i >= out) {
                set.add(i);
            } else {
                if(checkSetForInts(array[i], i, set)) {
                    set.add(i);
                } else {
                    if(i == 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private static boolean checkSetForInts(int num, int position, HashSet<Integer> set) {
        for (int i = num; i > 0; i--) {
            if (set.contains(i + position)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isEscapeableFaster(int[] array) {
        int out = array.length;

        for (int i = out -1; i >= 0; i--) {
            if(array[i] + i >= out) {
                out = i;
                if(i == 0) {
                    return true;
                }
            }
        }
        return false;
    }

//    private static int validSubarraysFromIntArray(int[] array, int sum) {
//        int prevTotal;
//        int currentTotal;
//        int position;
//        int result;
//        int total;
//        for (int i = 0; i < array.length; i++) {
//            boolean done = false;
//            while (!done) {
//
//            }
//        }
//        return result;
//    }

    private static int findNumberOfSubsets(int[] array, int sum) {
        Hashtable<String, Integer> memoizedTable = new Hashtable<String, Integer>();
        return checkTreeForSets(array, sum, array.length-1, memoizedTable);
    }

    private static int checkTreeForSets(int[] array, int sum, int position, Hashtable<String, Integer> table) {
        String key = sum + ":" + position;
        Integer toReturn = 0;
        if (table.containsKey(key)) {
            return table.get(key);
        }
        if (sum == 0) {
            return 1;
        } else if(sum < 0) {
            return 0;
        } else if(position < 0) {
            return 0;
        } else if(sum < array[position]) {
            toReturn = checkTreeForSets(array, sum, position - 1, table);
        } else {
            toReturn = checkTreeForSets(array, sum - array[position], position - 1, table) +
                    checkTreeForSets(array, sum, position - 1, table);
        }
        table.put(key, toReturn);
        return toReturn;
    }
}
