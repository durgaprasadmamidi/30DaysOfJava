package com.durgaprasadmamidi;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>(Arrays.asList("jack","bukky","cambrey","jack","bukky","cristin"));
        System.out.println(list);
        Set<String> set = new HashSet<>(list);
        System.out.println(set); //with out duplicates 

    }
}
