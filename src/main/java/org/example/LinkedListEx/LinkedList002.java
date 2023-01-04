package org.example.LinkedListEx;

import java.util.LinkedList;

public class LinkedList002 {
    public static void main(String[] args) {
        LinkedList<String>linkedList=new LinkedList<>();
        linkedList.add("Ramdevi");
        linkedList.add("Sakshi");
        linkedList.add("Amrita");
        linkedList.add("Roshani");
        linkedList.add("Dolly");
        linkedList.add("Mali");
        System.out.println(linkedList);
        linkedList.add(1,"Anjeli");

        System.out.println(linkedList);
        linkedList.addLast("Ritu");
        System.out.println(linkedList);
        linkedList.addFirst("Rakhi");
        System.out.println(linkedList);
        linkedList.removeLast();
        System.out.println(linkedList);
        linkedList.removeFirstOccurrence("Rakhi");
        System.out.println(linkedList);
        linkedList.removeLastOccurrence("Mali");
    }
}
