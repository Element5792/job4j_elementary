package ru.job4j.calculator;

public class Fit {
    public static double manWeight(double height) {
        return (height - 100) * 1.15;
    }

    public static double womenWeight(double height) {
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        System.out.println("Man 187 is " + Fit.manWeight(187));
        System.out.println("Women 170 is " + Fit.womenWeight(170));
    }
}
