package com.white.course2homework13.services;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorServiceImplParameterizedTest {
    private final CalculatorServiceImpl out = new CalculatorServiceImpl();

    @ParameterizedTest
    @MethodSource("provideParamsForAdditional")
    public void additionWhenAllCorrect(Integer val1, Integer val2, Integer expected) {
        int actual = out.addition(val1, val2);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForSubtraction")
    public void subtractionWhenAllCorrect(int val1, int val2, int expected) {
        int actual = out.subtraction(val1, val2);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForMultiplication")
    public void multiplicationWhenAllCorrect(int val1, int val2, int expected) {
        int actual = out.multiplication(val1, val2);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForDivision")
    public void divisionWhenAllCorrect(int val1, int val2,double expected) {
       double actual = out.division(val1,val2);
       assertEquals(expected,actual);
    }

    public static Stream<Arguments> provideParamsForAdditional() {
        return Stream.of(
                Arguments.of(1, 3, 4),
                Arguments.of(500, 250, 750),
                Arguments.of(58, 22, 80),
                Arguments.of(40, 60, 100));
    }

    public static Stream<Arguments> provideParamsForSubtraction() {
        return Stream.of(
                Arguments.of(77, 7, 70),
                Arguments.of(500, 250, 250),
                Arguments.of(58, 22, 36),
                Arguments.of(60, 60, 0));
    }

    public static Stream<Arguments> provideParamsForMultiplication() {
        return Stream.of(
                Arguments.of(7, 7, 49),
                Arguments.of(8, 12, 96),
                Arguments.of(58, 2, 116),
                Arguments.of(60, 60, 3600));
    }

    public static Stream<Arguments> provideParamsForDivision() {
        return Stream.of(
                Arguments.of(10, 5, 2),
                Arguments.of(50, 2, 25),
                Arguments.of(51, 17, 3),
                Arguments.of(60, 10, 6));
    }
}



