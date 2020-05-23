package com.durgaprasadmamidi;

import java.util.*;

public class Main {

    public static void main(String[] args) {
       List<String> list = new ArrayList<String>();
       String[] food = {"chicken","pizza","ice-cream"};

       for(String x:food){
           list.add(x);
       }
       for(int i=0;i<list.size();i++)
        System.out.println(list.get(i));
    }

}
