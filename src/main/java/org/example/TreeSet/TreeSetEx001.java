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
        Iterator<String>iterator=tl.iterator();
        while (iterator.hasNext()){
            String str=iterator.next();
            System.out.println(str);
        }
        Iterator iterator2=tl.descendingIterator();
        while (iterator2.hasNext()){
            System.out.println(iterator2.next());
        }

    }
}
