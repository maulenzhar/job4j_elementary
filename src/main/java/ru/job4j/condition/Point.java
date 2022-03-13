package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        int x = x2 - x1;
        int y = y2 - y1;
        double first = Math.pow(x, 2);
        double second = Math.pow(y, 2);
        double sum = first + second;
        return Math.pow(sum, 2);
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        double result1 = Point.distance(100, 1, 3, 1);
        double result2 = Point.distance(222, 2, 4, 2);
        System.out.println("result (0, 0) to (2, 0) " + result);
        System.out.println("result (100, 1) to (3, 1) " + result1);
        System.out.println("result (222, 2) to (4, 2) " + result2);
    }
}
