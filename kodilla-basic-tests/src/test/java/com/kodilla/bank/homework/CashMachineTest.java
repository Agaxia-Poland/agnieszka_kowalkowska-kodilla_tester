//package com.kodilla.bank.homework;
//
//import org.junit.jupiter.api.Test;
//
//import static com.kodilla.basic_assertion.ResultChecker.assertEquals;
//
//public class CashMachineTest {
//
//    @Test
//    public void shouldHaveZeroLength() {
//        CashMachine cashMashine = new CashMachine();
//        int[] transactions = cashMashine.getTransactions();
//        assertEquals(0, transactions.length);
//    }
//
//    @Test
//    public void shouldAddTwoElementsToArray() {
//        CashMachine cashMachine = new CashMachine();
//        cashMachine.add(4);
//        cashMachine.add(2);
//
//        int[] transactions = cashMachine.getTransactions();
//        assertEquals(2, transactions.length);
//        assertEquals(4, transactions[0]);
//        assertEquals(2, transactions[1]);
//    }
//
//    @Test
//    public void shouldReturnAverageEqualsZeroIsArrayIsEmpty() {
//        CashMachine cashMachine = new CashMachine();
//        assertEquals(0, cashMachine.getAverage(), 0.0001);
//    }
//
//
//}
