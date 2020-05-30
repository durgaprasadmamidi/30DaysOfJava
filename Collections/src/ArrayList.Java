package com.durgaprasadmamidi;

import java.util.*;

public class Main {

    public static void main(String[] args) {
       List<String> list1 = new ArrayList<String>();
       String[] food = {"chicken","pizza","ice-cream","fish"};
        for(String x:food){
            list1.add(x);
        }
       String[] yee = {"ice-cream","fish"};
       List<String> list2 = new ArrayList<String>();
        for(String y:yee){
            list2.add(y);
        }
        System.out.println("they gave:\n");
        for(int i=0;i<list1.size();i++)
            System.out.println(list1.get(i));
        System.out.println("\ni have selected:\n");
        editFood(list1,list2);
        for(int i=0;i<list1.size();i++)
            System.out.println(list1.get(i));
    }
    public static void editFood(Collection<String> l1,Collection<String> l2){
        Iterator<String> it = l1.iterator();
        while(it.hasNext()){
            if(l2.contains(it.next()))
                it.remove();
        }
    }
}
