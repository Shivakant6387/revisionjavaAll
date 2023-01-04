package org.example.MapEx;

import java.util.Map;
import java.util.TreeMap;

public class TreeMap001 {
    public static void main(String[] args) {
        TreeMap <Integer,String>treeMap=new TreeMap<>();
            treeMap.put(100,"Amit");
            treeMap.put(101,"Sumit");
            treeMap.put(102,"Mohit");
            for (Map.Entry m:treeMap.entrySet()){
                System.out.println(m.getKey()+""+m.getValue());
            }
    }

}
