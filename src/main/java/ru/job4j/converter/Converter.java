package ru.job4j.converter;

public class Converter {
    public static float rublesToEuro(float value) {
        float rsl = value / 70;
        return value / 70;
    }

    public static float rublesToDollar(float value) {
        float rsl = value / 60;
        return value / 60;
    }

    public static void main(String[] args) {
        //float euro = Converter.rublesToEuro(140);
        //float dollar = Converter.rublesToDollar(140);
        //System.out.println(Converter.rublesToEuro(140) + " euro");
        //System.out.println(Converter.rublesToDollar(540) + " dollar");
        System.out.println("140 rubles are " + rublesToEuro(140) + " euro. " + rublesToDollar(140) + " dollar");
    }

}