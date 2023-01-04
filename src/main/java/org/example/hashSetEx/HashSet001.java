package org.example.hashSetEx;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet001 {
    public static void main(String[] args) {
        HashSet set=new HashSet();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("Five");
        Iterator<String> iterator=set.iterator();
        while(iterator.hasNext()){
            String str=iterator.next();
            System.out.println(str);
        }
    }
}
