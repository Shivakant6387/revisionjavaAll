package org.example.MapEx;

import java.util.Hashtable;
import java.util.Map;

public class HashTable001 {
    public static void main(String[] args) {
        Hashtable<Integer,String >hm=new Hashtable<>();
        hm.put(1001,"Raj");
        hm.put(1002,"Surendra");
        for (Map.Entry m:hm.entrySet()){
            System.out.println(m.getKey()+""+m.getValue());
        }
    }
}
