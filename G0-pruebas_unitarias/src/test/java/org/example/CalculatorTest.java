package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class CalculatorTest {
    private static Calculator calculator;
    @BeforeAll
    static void setUp() {
        calculator = new Calculator();
    }

    @Test
    void sumaSimple(){
        double result = calculator.calculate(4,2, '+');
        Assertions.assertEquals(6, result);
    }

    @Test
    void restaSimple(){
        double result = calculator.calculate(4,2, '-');
        Assertions.assertEquals(2, result);
    }

    @Test
    void multiplicacionSimple(){
        double result = calculator.calculate(4,2, '*');
        Assertions.assertEquals(8, result);
    }

    @Test
    void divisionSimple(){
        double result = calculator.calculate(4,2, '/');
        Assertions.assertEquals(2, result);
    }

}
