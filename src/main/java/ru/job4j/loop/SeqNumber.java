package ru.job4j.loop;

public class SeqNumber {
    public static void main(String[] args) {
        calculate(6);
        calculate(5);
        calculate(3);
    }

    public static void calculate(int n) {
        int hold = 0;
        for (int index = 1; index <= n; index++) {
            hold += index;
            System.out.println(hold);
            if (hold == n) {
                System.out.println("N = " + n + ". Success");
                break;
            } else if (hold > n) {
                System.out.println("N = " + n + ". Not possible");
                break;
            }
        }
    }
}
