package com.durgaprasadmamidi;
public class Main {

    public static void main(String[] args) {

        // 0 arguments
        Time time0 = new Time();
        System.out.println(time0.militaryTime());

        // 1 argument
        Time time1 = new Time(3);
        System.out.println(time1.militaryTime());

        // 2 arguments
        Time time2 = new Time(13,45);
        System.out.println(time2.militaryTime());

        //3 arguments
        Time time3 = new Time(4,6,46);
        System.out.println(time3.militaryTime());
    }

}
