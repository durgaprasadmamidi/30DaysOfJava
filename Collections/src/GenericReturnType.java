package com.durgaprasadmamidi;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(max(10,34,69));
        System.out.println(max("hey","whats","up"));
    }
    public static <T extends Comparable<T>> T max(T a,T b,T c){
        T max = a;
        if(b.compareTo(max)>0)
            max=b;
        if(c.compareTo(max)>0)
            max=c;
        return max;
    }
}
