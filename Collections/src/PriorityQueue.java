package com.durgaprasadmamidi;

import java.util.*;

public class Main {

    public static void main(String[] args) {
       PriorityQueue<String> queue = new PriorityQueue<>();
       queue.offer("first");
        System.out.println(queue.peek()); // prints most priority element
       print(queue);
        queue.offer("second");
       print(queue);
        queue.offer("third");
       print(queue);
       queue.poll();
       print(queue);
       queue.poll();
       print(queue);
        queue.poll();
        print(queue);
    }
    public static void print(PriorityQueue<String> q){
        if(!q.isEmpty())
            System.out.println("Front "+q+" Rear");
        else
            System.out.println("Queue is empty");

    }

}
