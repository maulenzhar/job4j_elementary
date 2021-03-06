package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double sumOfDevideAndSubtract(double first, double second) {
        return subtract(first, second) + divide(first, second);
    }

    public static double sumOfAllMethod(double first, double second) {
        return sum(first, second) + multiply(first, second) + subtract(first, second) + divide(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + sumOfDevideAndSubtract(30, 20));
        System.out.println("Результат расчета равен: " + sumOfAllMethod(30, 20));
    }
}
