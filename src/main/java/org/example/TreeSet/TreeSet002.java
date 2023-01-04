package org.example.TreeSet;

import java.util.TreeSet;

public class TreeSet002 {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet=new TreeSet<>();
        treeSet.add(24);
        treeSet.add(54);
        treeSet.add(34);
        treeSet.add(32);
        System.out.println(treeSet.pollFirst());
        System.out.println(treeSet.pollLast());
    }
}
