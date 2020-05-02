package com.durgaprasadmamidi;

public class Time {
    private final int hour;
    private final int min;
    private final int sec;

    Time(){
        this(0,0,0);
    }

    Time(int h){
        this(h,0,0);
    }

    Time(int h,int m){
        this(h, m,0);
    }

    Time(int h, int m, int s){
        hour = (h >= 0) &&( h < 24) ? h : 0;
        min = (m >= 0) &&( m < 60) ? m : 0;
        sec = (s >= 0) &&( s < 60) ? s : 0;
    }

   public String militaryTime(){
        return String.format("%02d:%02d:%02d",hour,min,sec);
    }

}
