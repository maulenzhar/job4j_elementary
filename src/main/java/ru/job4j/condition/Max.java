package ru.job4j.condition;

public class Max {

    public static int max(int a, int b) {
        return a > b ? a : b;
    }

    public static int max(int a, int b, int c) {
        int res = max(a, b);
        return max(res, c);
    }

    public static int max(int a, int b, int c, int d) {
        int res = max(a, b, c);
        return max(res, d);
    }
}
