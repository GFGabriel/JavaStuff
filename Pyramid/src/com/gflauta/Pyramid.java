package com.company;

public class Pyramid {

    public Pyramid() {
    }

    public void createPyramid(int n) {
        int rows = n;
        for (int i = 0; i < rows; i++) {
            printPyramidLine(i, rows);
        }
    }

    public void printPyramidLine(int i, int n) {
        int characters = 2 * (n - 1) + 1;
        int marks = 2 * i + 1;
        int spaces = characters - marks;
        String string = "";
        for (int j = 0; j < characters; j++) {
            if (j < spaces/2 || j >= spaces/2 + marks) {
//                int thing1 = spaces/2;
//                int thing2 = characters - 1;
//                System.out.println("i: " + i + " n: " + n);
                string += " ";
            } else {
//                System.out.println("Adding X where i:" + i + ", j is: "+ j + " and n:" + n + "." );
                string += "x";
            }
        }
        System.out.println(string);
    }
}
