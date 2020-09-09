package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserValidatorTestSuite {
    private final UserValidator validator = new UserValidator();

    @ParameterizedTest
    @CsvSource(value = "^[a-zA-Z0-9._-]{3,}$")
    public void shouldValidateUsername(String input, String expected) {
        assertEquals(expected, validator.validateUsername(input));
    }

    @ParameterizedTest
    @CsvSource(value = "^([_a-zA-Z0-9-]+(\\.[_a-zA-Z0-9-]+)*@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*(\\.[a-zA-Z]{1,6}))?$")
    public void shouldValidateEmail(String input, String expected) {
        assertEquals(expected, validator.validateEmail(input));
    }
}