package com.kodilla.collections.adv.immutableSpecial.homework;

public class BookApplication {
    public static void main(String[] args) {
        BookManager bookManager = new BookManager();

        bookManager.createBook("Kompendium programisty.", "Jurek Jurek");
        System.out.println(bookManager.getBooks().size());
        bookManager.createBook("Kompendium programisty.", "Marek Marek");
        System.out.println(bookManager.getBooks().size());
        bookManager.createBook("Kompendium informatyka", "Marek Marek");
        System.out.println(bookManager.getBooks().size());
        bookManager.createBook("Kompendium programisty.", "Jurek Jurek");
        System.out.println(bookManager.getBooks().size());


        Book book1 = bookManager.createBook("Kompendium ...", "Jurek ...");
        Book book2 = bookManager.createBook("Kompendium ...", "Jurek ...");
        if (book1 == book2) { System.out.println("OK"); } else { System.out.println("Something went wrong");}
    }
}
