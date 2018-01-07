package com.gflauta;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //hard way
        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++) {
            intArrayList.add(Integer.valueOf(i));
        }
        for (int i = 0;i < intArrayList.size(); i++) {
            System.out.println(i + " --> " + intArrayList.get(i).intValue());
        }


        //easy way autoboxing and unboxing
        ArrayList<Double> doubleArrayList = new ArrayList<Double>();
        for (double d = 0.0; d < 5.0; d+=0.5) {
            doubleArrayList.add(d);
        }
        for(int i = 0; i < doubleArrayList.size(); i++)
        {
            System.out.println(doubleArrayList.get(i));
        }
    }
}
