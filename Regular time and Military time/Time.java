package com.durgaprasadmamidi;

public class Time {
    private int hour;
    private int min;
    private  int sec;
    Time(int h, int m, int s){
        hour = (h >= 0) &&( h < 24) ? h : 0;
        min = (m >= 0) &&( m < 60) ? m : 0;
        sec = (s >= 0) &&( s < 60) ? s : 0;
    }

   public String militaryTime(){
        return String.format("%02d:%02d:%02d",hour,min,sec);
    }

    public String regularTime(){
     return String.format("%d:%02d:%02d %s",(hour == 0 || hour == 12) ? 12 : hour%12, min, sec, (hour < 12) ? "AM" : "PM");
    }

}
