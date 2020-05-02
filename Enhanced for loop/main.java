package com.durgaprasadmamidi;

public class Main {

    public static void main(String[] args) {
        int[] marks = { 70, 80, 90, 60};
        int total = 0;
        // Enhanced for loop
        for(int x:marks){
            total += x;
        }
        System.out.println(total);
    }
}
