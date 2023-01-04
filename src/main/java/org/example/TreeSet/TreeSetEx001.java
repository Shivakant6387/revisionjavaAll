package org.example.TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEx001 {
    public static void main(String[] args) {
        TreeSet<String>tl=new TreeSet<>();
        tl.add("Ravi");
        tl.add("Shiva");
        tl.add("Mac");
        tl.add("Ajay");
        Iterator iterator=tl.descendingIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
