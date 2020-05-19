package com.durgaprasadmamidi;

public class Main {

    public static void main(String[] args) {
       food dp[] = new food[2];
       dp[0] = new pizza();
       dp[1] = new chicken();
       for(food x:dp){
           x.taste();
        }
    }

}
