package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 1;
        double res = (amount + amount * (percent / 100)) - salary;
        while (res >= 0) {
            year += 1;
            res = (res + res * (percent / 100)) - salary;
        }
        return year;
    }
}
