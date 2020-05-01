package com.durgaprasadmamidi;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        //primitive data types
        int age1 = 25;
        int age2 = age1;
        age1 += 5;
        System.out.println(age2);
        //reference data type
        Point point1 = new Point(1,1);
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2);
    }
}
