package org.example.MapEx;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMap001 {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String>linkedHashMap=new LinkedHashMap<>();
            linkedHashMap.put(1001,"Mali");
            linkedHashMap.put(1002,"Mato");
            linkedHashMap.put(1003,"Mac");
            for (Map.Entry m:linkedHashMap.entrySet()){
                System.out.println(m.getKey()+""+m.getValue());
            }
    }
}
