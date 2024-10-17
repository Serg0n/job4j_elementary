package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return multiply(first, second) + sum(first, second);
    }

    public static double diferenceAndDivision(double first, double second) {
        return difference(first, second) + division(first, second);
    }

    public static double sumMathCalc(double first, double second) {
        return multiply(first, second) + division(first, second)
                + sum(first, second) + difference(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + diferenceAndDivision(50, 25));
        System.out.println("Результат расчета равен: " + sumMathCalc(50, 25));
    }
}