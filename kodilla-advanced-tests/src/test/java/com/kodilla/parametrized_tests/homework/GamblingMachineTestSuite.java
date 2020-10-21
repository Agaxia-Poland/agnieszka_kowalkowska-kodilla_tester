package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class GamblingMachineTestSuite {

    @ParameterizedTest
    @CsvFileSource(resources = "/GoodNumbers.csv")
    public void shouldCheckWinsWork(String numbers) throws InvalidNumbersException {
        String[] parsedNumbers = numbers.split(",");
        Set numbersInt = new HashSet<>();
        GamblingMachine gamblingMachine = new GamblingMachine();
        for (String number : parsedNumbers) {
            numbersInt.add(Integer.valueOf(number));
            int result = gamblingMachine.howManyWins(numbersInt);
            Assertions.assertTrue(result <= 6);
            Assertions.assertTrue(result >= 0);
        }

    }

    @ParameterizedTest
    @CsvFileSource(resources = "/WrongNumbers.csv")
    public void shouldErrorIfAddBadValuesOnlyNumbers(String numbers) {
        String[] intWrongNumbers = numbers.split(",");
        Set numbersIntWrong = new HashSet<>();
        GamblingMachine gamblingMachine = new GamblingMachine();
        for (String number : intWrongNumbers) {
            numbersIntWrong.add(Integer.valueOf(number));
            Assertions.assertThrows(InvalidNumbersException.class, () -> {
                gamblingMachine.howManyWins(numbersIntWrong);
            });
        }
    }

    @Test
    public void shouldErrorIfAddOneGoodValue() {
        GamblingMachine gamblingMachine = new GamblingMachine();
        Set<Integer> set = new HashSet<>();
        set.add(5);
        Assertions.assertThrows(InvalidNumbersException.class, () -> {
            gamblingMachine.howManyWins(set);
        });
    }

    @Test
    public void shouldComputerAddGoodValues() {
        GamblingMachine gamblingMachine = new GamblingMachine();
        Set<Integer> set = gamblingMachine.getGenerateComputerNumbers();
        Assertions.assertEquals(6, set.size());
        assertTrue(Collections.max(set) <= 50);
        assertTrue(Collections.min(set) > 0);
    }
}