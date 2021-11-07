package ru.job4j.converter;

public class Converter {
    public static float rublesToEuro(float value) {
        return value / 70;
    }

    public static float rublesToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float in1 = 140;
        float expected1 = 2;
        float out1 = rublesToEuro(in1);
        boolean passed1 = expected1 == out1;
        System.out.println("140 rubles are. Test result : " + passed1);
        float in2 = 120;
        float expected2 = 2;
        float out2 = rublesToDollar(in2);
        boolean passed2 = expected2 == out2;
        System.out.println("120 rubles are. Test result : " + passed2);
        System.out.println("140 rubles are " + rublesToEuro(140) + " euro. " + rublesToDollar(120) + " dollar");
    }
}
