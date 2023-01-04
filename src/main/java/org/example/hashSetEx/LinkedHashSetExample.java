package org.example.hashSetEx;

import java.util.LinkedHashSet;

class Book2 {
    int id;
    String name,author,publisher;
    int quantity;
    public Book2(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
}
public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<Book2> hs = new LinkedHashSet<>();
        //Creating Books
        Book2 b11 = new Book2(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
        Book2 b21 = new Book2(102, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
        Book2 b31 = new Book2(103, "Operating System", "Galvin", "Wiley", 6);
        //Adding Books to hash table
        hs.add(b21);
        hs.add(b11);
        hs.add(b31);
        //Traversing hash table
        for (Book2 b : hs) {
            System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
        }
    }
}
