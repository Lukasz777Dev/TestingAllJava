package testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

public class CalculatorTest {
    public static Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    public static void shouldSubtractionNumbers() {
        Assertions.assertEquals(10, calculator.getSubtraction(15, 5));
    }

    @Test
    public static void shouldMultiplicationNumbers() {
        Assertions.assertEquals(20, calculator.getMultiplication(2, 25));
    }

    @Test
    public static void shouldAdditionNumbers(int numberA, int numberB) {
        Assertions.assertEquals(7, calculator.getAddition(1, 6));
     /*   int sum = numberA + numberB;
        // Assertions.assertTrue(numberA + numberB);
        assert sum == numberA + numberB;*/
    }

    @Test
    public static void shouldMultiplicationNumbers(int number1, int number2) {
        Assertions.assertEquals(360, calculator.getMultiplication(60, 6));
    }

    @Test
    public static void shouldSubtractionNumbers(int numberA, int numberB) {
        Assertions.assertEquals(24, calculator.getAddition(30, 6));
     /*   int sum = numberA + numberB;
        // Assertions.assertTrue(numberA + numberB);
        assert sum == numberA + numberB;*/
    }




    /*
    @Test
    void shouldSubtraction(int number1, int number2){
        Calculator calculator = new Calculator();
        Assertions. (expected: 5,calculator.getSubtraction(15,3));
    }*/


}
