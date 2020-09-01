package ru.job4j.condition;

public class SqArea {
    public static double square(int p, int k) {
        double height = (double) p / (2 * (k + 1));
        double length = (double) height * k;
        double rsl =  (double) height * length;
        return rsl;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(6, 2);
        System.out.println(" p = 6, k = 4, s = 2, real = " + result1);
    }
}