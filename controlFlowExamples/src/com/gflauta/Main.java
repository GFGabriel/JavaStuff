package com.gflauta;

public class Main {

    public static void main(String[] args) {

        int switchValue = 7;

        switch(switchValue) {
            case 1:
                System.out.println("The value is 1");
                break;

            case 2:
                System.out.println("The value is 2");
                break;

            case 3: case 4: case 5:
                System.out.println("The value is 3, 4, or 5");
                break;

            default:
                System.out.println("The value is not between 1 and 5");
                break;
        }

        char letter = 'f';

        switch(letter) {
            case 'a':
                System.out.println("This is an a.");
                break;
            case 'b':
                System.out.println("This is a b.");
                break;
            case 'c':
                System.out.println("This is a c.");
                break;
            case 'd':
                System.out.println("This is a d.");
                break;
            case 'e':
                System.out.println("This is an e.");
                break;
            default:
                System.out.println("Letter not found.");
                break;
        }

        String month = "January";

        switch(month.toLowerCase()) {
            case "january":
                System.out.println("It is January");
                break;
            case "february":
                System.out.println("It is February");
                break;
            case "march":
                System.out.println("It is March");
                break;
            default:
                System.out.println("It is not the beginning of the year");
                break;
        }

//        for(int i = 0; i < 7; i++) {
//            System.out.println(("10,000 at " + (i+2) + "% interest = " + String.format("%.2f", calculateIntersest(10000.0d, i+2))));
//        }

        for(int i = 8; i >= 2; i--) {
            System.out.println(("10,000 at " + i + "% interest = " + String.format("%.2f", calculateIntersest(10000.0d, i))));
        }

        int count = 0;
        for (int i = 49; i < 200; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                count++;
                if (count >= 3) {
                    break;
                }
            }
        }

        int whileStartNumber = 5;
        int whileFinishNumber = 20;
        int evensFound = 0;
        while(whileStartNumber < whileFinishNumber) {
            if(!isEvenNumber(whileStartNumber)) {
                whileStartNumber++;
                continue;
            }
            evensFound++;
            if (evensFound == 5) {
                break;
            }
            whileStartNumber++;
        }

        System.out.println("Evens found: " + evensFound);
    }

    public static double calculateIntersest(double amount, double interestRate) {
        return(amount* (interestRate/100));
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEvenNumber (int n) {
        if (n % 2 == 0) {
            return true;
        }
        return false;
    }
}
