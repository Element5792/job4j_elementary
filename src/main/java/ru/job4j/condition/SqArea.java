package ru.job4j.condition;

public class SqArea {
    public static double sqarea(double p, double k) {
        return (p / (2 * (k + 1)) * k) * (p / (2 * (k + 1)));
    }

    public static void main(String[] args) {
        double result = SqArea.sqarea(6, 2);
        System.out.println(result);
    }
}
