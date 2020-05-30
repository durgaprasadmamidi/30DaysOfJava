package com.durgaprasadmamidi;

import java.util.*;

public class Main {

    public static void main(String[] args) {
       int[] first = {1,2,3,4,5,6};
       int[] last = {7,8,9};
        List<Integer> list1 = new LinkedList<Integer>();
        List<Integer> list2 = new LinkedList<Integer>();
        for(int x:first)
            list1.add(x);
        for(int x:last)
            list2.add(x);
        list1.addAll(list2);
        list2= null;

        print(list1);
        remove(list1,2,6);
        System.out.println("\nreverse :");
        reverse(list1);

    }

    private static void print(List<Integer> list){
        for(int x:list)
            System.out.print(x+" ");
    }

    private static void remove(List<Integer> list,int from,int to){
        list.subList(from,to).clear();
    }

    private static  void reverse(List<Integer> list){
        ListIterator<Integer> iterator = list.listIterator(list.size());
        while(iterator.hasPrevious())
            System.out.print(iterator.previous()+" ");
    }

}
