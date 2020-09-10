package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] rsl = new int[size][size];
        for (int i = 0; i < rsl.length; i++) {
            for (int j = 0; j < rsl[i].length; j++) {
                rsl[i][j] = (i + 1) * (j + 1);
            }
        }
        return rsl;
    }
}
