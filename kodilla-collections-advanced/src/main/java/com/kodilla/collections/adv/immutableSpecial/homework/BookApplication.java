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


        Book b1 = new Book ("Kompendium programisty.", "Jurek Jurek");
        Book b2 = new Book ("Kompendium programisty.", "Jurek Jurek");
        System.out.println("Porównanie adresów: " + (b1 == b2));
    }
}
