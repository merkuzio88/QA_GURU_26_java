package ru.merkuzio;

public class FirstClass {
    public static void main(String... args) {

        int maxInt = Integer.MAX_VALUE;
        int zero = 0;
        int one = 1;

        int usualResult = maxInt + zero;
        int overflowResult = maxInt + one;

        System.out.println("Usual result: " + usualResult);
        System.out.println("Overflow result: " + overflowResult);

        if (usualResult > 0 && overflowResult > 0) {
            System.out.println("Both results are positive");
        } else {
            System.out.println("At least one result is negative");
        }

        int intValue = 5;
        double doubleValue = 6.5;

        System.out.println("The result of adding int and double: " + (intValue + doubleValue));

        String result = String.valueOf(intValue + doubleValue);
        int resultLenght = result.length();
        char lastDigit = result.charAt(resultLenght - 1);

        String message;
        message = lastDigit == '0' ? "Zero!" : "Not Zero!";

        System.out.println(message);

        int intValue2 = 10;
        long longValue = 20L;
        float floatValue = 3.5f;
        double doubleValue2 = 2.5;

        System.out.println("The result of adding different types: " +
                (intValue2 + longValue + floatValue + doubleValue2));
    }
}
