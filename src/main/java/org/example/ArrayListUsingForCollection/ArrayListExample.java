package org.example.ArrayListUsingForCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

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
        //use set and get
        System.out.println(list.get(2));
        list.set(1,"Jacky");
        //use for each loop
        for (String name:list){
            System.out.println(name);
        }

        System.out.println("Sorting number");
        List<Integer> list1=new ArrayList<>();
        list1.add(21);
        list1.add(32);
        list1.add(52);
        list1.add(1);
        Collections.sort(list1);
        for (Integer integer:list1){
            System.out.println(integer);
        }
    }
}
