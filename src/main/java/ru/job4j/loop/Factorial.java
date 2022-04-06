package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int result = 1;
        for (int i = result; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Factorial.calc(5));
        System.out.println(Factorial.calc(3));
        System.out.println(Factorial.calc(4));
        System.out.println(Factorial.calc(0));
    }
}