package com.kodilla.exception.homework;

public class OrderDoesntExistException extends Exception {
    private static final String EXCEPTION_MESSAGE = "Empty List";
    public OrderDoesntExistException(){
        super(EXCEPTION_MESSAGE);
    }
}
