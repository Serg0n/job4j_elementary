package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        boolean standard = data[0];
        for (int i = 0; i < data.length; i++) {
            result = standard == data[i];
            if (!result) {
                break;
            }
        }
        return result;
    }
}