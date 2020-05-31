package com.durgaprasadmamidi;

import java.util.*;

public class Main {

    public static void main(String[] args) {
       Stack<String> stack = new Stack<String>();
       stack.push("first");
       print(stack);
       stack.push("second");
       print(stack);
       stack.push("third");
       print(stack);
       stack.pop();
       print(stack);
       stack.pop();
       print(stack);
        stack.pop();
        print(stack);
    }
    public static void print(Stack<String> s){
        if(!s.isEmpty())
            System.out.println(s+" Top");
        else
            System.out.println("stack is empty");

    }

}
