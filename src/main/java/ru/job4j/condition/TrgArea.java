package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double p = 0.5 * (a + b + c);
        return  Math.sqrt(p);
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(2, 2, 2);
        double rsl2 = TrgArea.area(4, 5, 6);
        System.out.println("area (2, 2, 2) = " + rsl);
        System.out.println("area (4, 5, 6) = " + rsl2);
    }
}
