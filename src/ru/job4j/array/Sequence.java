package ru.job4j.array;

public class Sequence {
    public static void main(String[] args) {
        int[][] array = new int[9][9];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = j + 1;
            }
        }
    }
}
