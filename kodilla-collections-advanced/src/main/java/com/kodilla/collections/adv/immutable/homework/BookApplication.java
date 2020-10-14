package com.kodilla.collections.adv.immutable.homework;

import com.kodilla.collections.adv.immutable.Book;

public class BookApplication {
    public static void main(String[] args) {
        BookManager bookManager = new BookManager();

        bookManager.createBook("Kompendium programisty.", "Jurek Jurek");
        System.out.println(bookManager.getBooks().size());
        bookManager.createBook("Kompendium programisty.", "Marek");
        System.out.println(bookManager.getBooks().size());
        bookManager.createBook("Kompendium.", "Marek");
        System.out.println(bookManager.getBooks().size());
        bookManager.createBook("Kompendium programisty.", "Jurek Jurek");
        System.out.println(bookManager.getBooks().size());


        Book b1 = new Book("Kompendium programisty.", "Jurek Jurek");
        Book b2 = new Book("Kompendium programisty.", "Jurek Jurek");
        System.out.println("Porównanie adresów: " + (b1 == b2));

    }
}

