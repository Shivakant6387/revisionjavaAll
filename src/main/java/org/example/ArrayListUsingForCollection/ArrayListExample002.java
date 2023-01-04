package org.example.ArrayListUsingForCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListExample002 {
    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<>();
        list.add("Ravi");
        list.add("Kajal");
        list.add("Sakshi");
        list.add("Bholi");
        System.out.println("Traversing list through list iterator");
        ListIterator<String>listIterator=list.listIterator(list.size());
        while(listIterator.hasPrevious()){
            String str=listIterator.previous();
            System.out.println(str);
        }
        System.out.println("Traversing list through for loop");
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println("Traversing list through foreach loop");
        list.forEach(a->{
            System.out.println(a);
        });
    }
}
