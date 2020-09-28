package com.durgaprasadmamidi;


import com.durgaprasadmamidi.Genrics.GenericList;

public class Main {
    public static void main(String[] args) {
        var list = new GenericList<Float>();
        list.add( 2f);
        list.add( 5f);
        list.add( 7f);
        list.add( 10f);
       // System.out.println(list.get(3));
            for(float item :list)
                System.out.println(item);
    }
}

