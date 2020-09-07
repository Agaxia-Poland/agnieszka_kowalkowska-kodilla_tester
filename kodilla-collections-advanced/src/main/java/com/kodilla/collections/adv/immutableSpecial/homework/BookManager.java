package com.kodilla.collections.adv.immutableSpecial.homework;

public class BookManager extends Book {

    public BookManager(String title, String author) {
        super(title, author);
    }

    public void createBook(String title, String author) {
        Book book = new Book("New Time", "Adam Peterson");
        return;
    }

    public static void main(String[] args) {
        String a = "title: New Time, author Adam Peterson";
        String b = "title: Old Time, author Peter Adamson";
        String c = "title: New Time, author Adam Peterson";
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        System.out.println(a==b);
        System.out.println(a==c);
        System.out.println("-------------");

    }

}
