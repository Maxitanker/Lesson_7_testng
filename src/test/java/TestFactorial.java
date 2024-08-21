package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFactorial {

    @Test
    public void testCalculateFactorialForPositiveNumber() {
        FactorialCalculator calculator = new FactorialCalculator();
        int result = calculator.calculateFactorial(5);
        Assert.assertEquals(result, 120, "Факториал 5 должен быть равен 120");
    }

    @Test
    public void testCalculateFactorialForZero() {
        FactorialCalculator calculator = new FactorialCalculator();
        int result = calculator.calculateFactorial(0);
        Assert.assertEquals(result, 1, "Факториал 0 должен быть равен 1");
    }

    @Test
    public void testCalculateFactorialForOne() {
        FactorialCalculator calculator = new FactorialCalculator();
        int result = calculator.calculateFactorial(1);
        Assert.assertEquals(result, 1, "Факториал 1 должен быть равен 1");
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testCalculateFactorialForNegativeNumber() {
        FactorialCalculator calculator = new FactorialCalculator();
        calculator.calculateFactorial(-5);
    }
}
