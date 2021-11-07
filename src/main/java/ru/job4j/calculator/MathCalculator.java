package ru.job4j.calculator;

import ru.job4j.math.MathFunction;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return MathFunction.sum(first, second) + MathFunction.multiply(first, second);
    }

    public static double minusAndDivision(double first, double second) {
        return MathFunction.division(first, second) + MathFunction.minus(second, first);
    }

    public static double total(double first, double second) {
        return sumAndMultiply(first, second) + minusAndDivision(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчёта равен: " + minusAndDivision(10, 20));
        System.out.println("Результат расчёта равен: " + total(10, 20));
    }

}
