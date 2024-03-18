package com.white.course2homework13.services;


import com.white.course2homework13.exception.DivisionOnZeroException;
import com.white.course2homework13.exception.InputNullException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceImplTest {
   private final CalculatorServiceImpl out = new CalculatorServiceImpl();

    @Test
    void welcome() {
        String expected = "Добро пожаловать в калькулятор";
        String actual = out.welcome();
        assertEquals(expected, actual);
    }

    @Test
    void additionWhenResultCorrect() {
        int expected = 10;
        int actual = out.addition(9, 1);
        assertEquals(expected, actual);
    }

    @Test
    void additionWhenResultIncorrect() {
        int expected = 11;
        int actual = out.addition(9, 1);
        assertNotEquals(expected, actual);
    }

    @Test
    void subtractionWhenResultCorrect() {
        int expected = 8;
        int actual = out.subtraction(9, 1);
        assertEquals(expected, actual);
    }
    @Test
    void subtractionWhenResultIncorrect() {
        int expected = 8;
        int actual = out.subtraction(9, 5);
        assertNotEquals(expected, actual);
    }

    @Test
    void multiplicationWhenResultCorrect() {
        int expected = 55;
        int actual = out.multiplication(11,5);
        assertEquals(expected, actual);
    }
    @Test
    void multiplicationWhenResultIncorrect() {
        int expected = 55;
        int actual = out.multiplication(11,8);
        assertNotEquals(expected, actual);
    }
    @Test
    void divisionWhenResultCorrect() {
        int expected = 4;
        double actual = out.division(12,3);
        assertEquals(expected, actual);
    }
    @Test
    void divisionWhenResultIncorrect() {
        int expected = 55;
        double actual = out.division(11,8);
        assertNotEquals(expected, actual);
    }
    @Test
    void divisionWhenSecondParamIsZero() {
        assertThrows(DivisionOnZeroException.class,()->out.division(55,0)) ;
    }
    @Test
    void calculateWhenOneParamIsNull() {
        assertThrows(InputNullException.class,()->out.addition(55,null)) ;
        assertThrows(InputNullException.class,()->out.addition(null,7)) ;
        assertThrows(InputNullException.class,()->out.subtraction(55,null)) ;
        assertThrows(InputNullException.class,()->out.subtraction(null,8)) ;
        assertThrows(InputNullException.class,()->out.multiplication(55,null)) ;
        assertThrows(InputNullException.class,()->out.multiplication(null,5)) ;
        assertThrows(InputNullException.class,()->out.division(55,null)) ;
        assertThrows(InputNullException.class,()->out.division(null,0)) ;
    }
}