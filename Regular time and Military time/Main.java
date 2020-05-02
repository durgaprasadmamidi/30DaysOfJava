package com.durgaprasadmamidi;
public class Main {

    public static void main(String[] args) {

        Time time = new Time(0,3,45);

        // 24-hr format
        System.out.println(time.militaryTime());

        // 12-hr format
        System.out.println(time.regularTime());

    }

}
