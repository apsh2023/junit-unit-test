package com.example.demo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidatorTest {

    @Test
    @DisplayName("Test The mobile number")

    <string>
    void isPhoneNumberValid_with_start0() {
        boolean num = Validator.isPhoneNumberValid ("072655598");
        assertTrue(num,"The number is correct");
    }
    @Test
    @DisplayName("Test addition of two numbers")
    void isPhoneNumber_Valid_with_starts1() {
        boolean num = Validator.isPhoneNumberValid ("172655598");
        assertFalse(num,"The number is  correct");
    }

    @Test
    @DisplayName("Test addition of two numbers")
    void isPhoneNumber_Valid_with_12_digits() {
        boolean num = Validator.isPhoneNumberValid ("072655598123");
        assertFalse(num,"The number is not correct");
    }
    @Test
    @DisplayName("Test addition of two numbers")
    void isPhoneNumber_Valid_with_alfa_numeric_value() {
        boolean num = Validator.isPhoneNumberValid ("1726555@8");
        assertFalse(num,"The number is  correct");
    }

    @Test
    @DisplayName("Test addition of two numbers")
    void isEmailValid_with_correct_address() {
        boolean mail = Validator.isEmailValid("bla.99.bla@gmail.com");
        assertTrue(mail,"The Email is valid");
    }

    @Test
    @DisplayName("Test addition of two numbers")
    void isEmailValid_without_name() {
        boolean mail = Validator.isEmailValid("@gmail.com");
        assertFalse(mail,"The Email is not valid");
    }

    @Test
    @DisplayName("Test addition of two numbers")
    void isEmailValid_without_$$() {
        boolean mail = Validator.isEmailValid("bla.gmail.com");
        assertFalse(mail,"The Email is valid");
    }
    @Test
    @DisplayName("Test addition of two numbers")

    void isEmailValid_without_com() {
        boolean mail = Validator.isEmailValid("bla@gmail.");
        assertFalse(mail,"The Email is valid");
    }

}