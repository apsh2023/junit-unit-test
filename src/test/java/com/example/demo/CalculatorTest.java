package com.example.demo;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static java.lang.Double.NaN;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    static Calculator calculator;

    @BeforeAll
    public static void init() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Test addition of two numbers case 1")
    void add_two_positive_numbers_return_addition_success() {
        //Calculator calculator = new Calculator();
        int sum = calculator.add(1, 2);
        assert (sum == 3);
    }

    @Test
    @DisplayName("Test addition with negative value case 2")
    void add_two_negative_numbers_return_addition_() {
        int sum = calculator.add(-1, -2);
        assert (sum == -3);
    }

    @Test
    @DisplayName("Test addition of two numbers with negative value case 3")
    void add_one_negative_and_one_positive_number_return_addition_() {
        int sum = calculator.add(-1, 2);
        assert (sum == 1);
    }

    @Test
    @DisplayName("Test addition of two numbers with Max Integer value case 4")
    void add_values_more_than_integer_max_length_and_return_failure() {
        int sum = calculator.add(Integer.MAX_VALUE, Integer.MAX_VALUE);
        assertTrue(sum < 0, "Expected integer overflow");
    }

    @Test
    @DisplayName("Test subtract of two numbers case 5")
    void subtract_two_number_return_success() {
        int sub = calculator.subtract(2, 1);
        assert (sub == 1);
    }

    @Test
    @DisplayName("Test subtraction of two numbers, value a is bigger then value b. case 6")
    void subtract_two_number_return_fail() {
        int sub = calculator.subtract(5, 10);
        assert (sub == -5);
    }

    @Test
    @DisplayName("Test subtraction of two numbers,value a is 1 and value bis  Max integer value. case7")
    void subtract_two_number_return_fail1() {
        int sub = calculator.subtract(1, -Integer.MAX_VALUE);
        assertTrue(sub < 0, "Expected integer overflow");
    }

    @Test
    @DisplayName("Test subtraction of two numbers value a is integer Max value and value b is 1 case 8")
    void subtract_two_number_return_fail2() {
        int sub = calculator.subtract(Integer.MAX_VALUE, 1);
        assert (sub == 2147483646);
    }

    @Test
    @DisplayName("Test multiply of two numbers case 9")
    void multiply_two_number_return_success() {
        int mul = calculator.multiply(2, 3);
        assert (mul == 6);
    }

    @Test
    @DisplayName("Test multiply with 0 value case 10")
    void multiply_two_number_return_result() {
        int mul = calculator.multiply(-2, 0);
        assert (mul == 0);
    }

    @Test
    @DisplayName("Test addition of two numbers case 11")
    void divide_two_number_return_success() {
        double div = calculator.divide(6, 6);
        assert (div == 1);

    }

    @Test
    @DisplayName("Test square root of two numbers case 12")
    void squareRootOf_one_number_return_success() {
        double root = calculator.squareRootOf(4);
        assert (root == 2);
    }


    @Test
    @DisplayName("Test square root of negative number case 13")
    void squareRootOf_one_number_return_nan() {
        double root = calculator.squareRootOf(-4);
        assertEquals(Double.NaN,  root);

    }

    @Test
    @DisplayName("Test area case 14")
    void getArea_return_success() {
        double area = calculator.getArea(4);
        assert (area == 50.27);
    }

    @Test
    @DisplayName("Test circumference case 15")
    void getCircumference_return_success() {
        double circumference = calculator.getCircumference(2);
        assert (circumference == 12.57);
    }
}