package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println(testRubleToEuro(140, 2));

        float dollar = Converter.rubleToDollar(140);
        System.out.println("140 rubles are " + dollar + " dollar.");
        System.out.println(testRubleToDollar(140, 2.3333333f));

    }

    public static String testRubleToEuro(float in, float expected) {
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        return  in + " rubles are " + expected + ". Test result : " + passed;
    }

    public static String testRubleToDollar(float in, float expected) {
        float out = Converter.rubleToDollar(in);
        boolean passed = expected == out;
        return  in + " rubles are " + expected + ". Test result : " + passed;
    }

}
