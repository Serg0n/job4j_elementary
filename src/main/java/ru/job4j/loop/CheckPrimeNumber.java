package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        int i = 2;
        boolean result = true;
        if (number == 1) {
            result = false;
            return result;
        }
        for (; i < number; i++) {
            if (number % i == 0) {
                result = false;
                break;
            }
        }
        return result;
    }
}