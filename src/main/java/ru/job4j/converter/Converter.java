package ru.job4j.converter;
public class Converter {
    public static float rubleToEuro(float value) {
        return value / 90;
    }
    public static float rubleToDollar(float value) {
        return value / 75;
    }
}