package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserValidatorTestSuite {
    private UserValidator validator = new UserValidator();

//    @ParameterizedTest
//    @ValueSource(strings = {"^[a-zA-Z0-9._-]{3,}$"})
//    public void shouldReturnTrueIfUsernameHasAboveStrings(String text) {
//        assertTrue(validator.validateUsername(text));
//    }

    @ParameterizedTest
    @ValueSource(strings = {"^[a-zA-Z0-9._-]{3,}$"})
    public void shouldReturnFalseIfUsernameHasNotAboveStrings(String text) {
        assertFalse(validator.validateUsername(text));
    }
}


