package org.example.ArrayListUsingForCollection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<>();
        list.add("Mac Vogel");
        list.add("Mato kato");
        list.add("Mali ");
        list.add("Marry");
        System.out.println(list);
        //use Iterator
        Iterator iterator=list.iterator();
        while (iterator.hasNext()){
            String str= (String) iterator.next();
            System.out.println(str);
        }
        //use for each loop
        for (String name:list){
            System.out.println(name);
        }
    }
}
