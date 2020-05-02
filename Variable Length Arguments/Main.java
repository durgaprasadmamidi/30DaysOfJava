package com.durgaprasadmamidi;

public class Main {

    public static void main(String[] args) {
        // passing variable length arguments
        System.out.println(average(70,60,80,90,83));

    }
    public static int average(int...marks)
    {
        int total = 0;
        for(int x:marks){
            total += x;
        }
        return total;
    }
}
