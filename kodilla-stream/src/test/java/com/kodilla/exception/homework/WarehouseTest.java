package com.kodilla.exception.homework;

import junit.framework.TestCase;
import org.junit.Test;

public class WarehouseTest extends TestCase {
    @Test
    public void testDoesOrderExists() throws OrderDoesntExistException {
        //given
        Order order = new Order("Order3");
        //when
        boolean doesOrder3Exists = (boolean) order.doesOrderExists("Order3");
        //then
        assertTrue(doesOrder3Exists);
    }

    @Test(expected = OrderDoesntExistException.class)
    public void testDoesOrderExists_withException() throws OrderDoesntExistException {
        //given
        Order order = new Order("Order1");
        //when
        boolean doesOrderExists = (boolean) order.doesOrderExists("Order1");
        //then
        assertTrue(doesOrderExists);
    }
}