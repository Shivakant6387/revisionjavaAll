package org.example.MapEx;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx001 {
    public static void main(String[] args) {
        Map map=new HashMap();
        map.put(1,"Amit");
        map.put(2,"Rajeni");
        map.put(3,"Aditya");
        map.put(4,"Anjeli");
        Set set=map.entrySet();
        Iterator iterator=set.iterator();
        while (iterator.hasNext()){
            Map.Entry entry=(Map.Entry)iterator.next();
            System.out.println(entry.getKey()+""+entry.getValue());
        }
    }
}
