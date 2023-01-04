package org.example.LinkedListEx;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEx001 {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        list.add(21);
        list.add(43);
        list.add(13);
        list.add(90);
        list.add(83);
        System.out.println(list);
        Iterator<Integer>iterator=list.iterator();
        while(iterator.hasNext()){
            Integer integer=iterator.next();
            System.out.println(integer);
        }
    }
}
