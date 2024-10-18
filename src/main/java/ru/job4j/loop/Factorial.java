package ru.job4j.loop;

public class Factorial {
    public static int calculate(int number) {
        int result = 1;
        int i = 1;
        if (number == 0) {
            return result;
        } else {
            for (; i <= number; i++) {
                result *= i;
            }
            return result;
        }
    }
}
