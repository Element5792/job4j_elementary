package ru.job4j.calculator;

public class Fit {
    public static double manWeight(double height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }

    public static double womenWeight(double height) {
        double rsl = (height - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        //short height = 176;
        //double man = Fit.manWeight(176);
        System.out.println("Man 187 is " + Fit.manWeight(187));
        System.out.println("Women 170 is " + Fit.womenWeight(170));
    }
}
