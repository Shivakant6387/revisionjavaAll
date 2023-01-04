package org.example.PriorityQueueEx;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueEx001 {
    public static void main(String[] args) {
        PriorityQueue<String>priorityQueue=new PriorityQueue<>();
        priorityQueue.add("Amit");
        priorityQueue.add("Rakesh");
        priorityQueue.add("Mohit");
        System.out.println(priorityQueue.element());
        System.out.println(priorityQueue.peek());
        Iterator<String >iterator=priorityQueue.iterator();
        while (iterator.hasNext()){
            String str=iterator.next();
            System.out.println(str);
        }
    }
}
