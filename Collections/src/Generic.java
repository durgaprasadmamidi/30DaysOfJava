package com.durgaprasadmamidi;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        String[] strings = {"jack","bucky","wick","cristin"};
        Integer[] integers = {1,2,3,4};
        printMe(strings);
        printMe(integers);
    }
    public static <T> void printMe(T[] dp){
        for(T x:dp)
        System.out.printf("%s ",x);
        System.out.println();
    }
}
