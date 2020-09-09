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


        Book b1 = new Book("Kompendium programisty.", "Jurek Jurek");
        Book b2 = new Book("Kompendium programisty.", "Jurek Jurek");
        System.out.println("Porównanie adresów: "+(b1 == b2));

//        System.out.println("Porównanie adresów: "+(b1 == b2));
//        System.out.println("Porównanie adresów: "+(b1.equals(b2)));
//        System.out.println("Porównanie adresów: "+(b2.equals(b3)));
//        System.out.println("Porównanie adresów: "+(b1.equals(b4)));
//        System.out.println("Porównanie adresów: "+(b1.hashCode() == b4.hashCode()));
//        System.out.println("Porównanie adresów: "+(b1.equals(new ImmutableSpecialCases())));

    }
}
