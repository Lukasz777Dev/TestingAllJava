package testing;


public class Calculator {
    int number1 = 0;
    int number2 = 0;


    /*(assert= "testAdditionTwoNumbers")*/
    @Pattern
    public static int getAddition(int number1, int number2) {
        return number1 + number2;
    }

    @Pattern
    public static int getSubtraction(int number1, int number2) {
        return number1 - number2;
    }

    @Pattern
    public static int getDivision(int number1, int number2) {
        return number1 % number2;
    }

    @Pattern
    public static int getMultiplication(int number1, int number2) {
        return number1 * number2;
    }

}
