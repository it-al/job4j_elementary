package ru.job4j.array;

public class LengthArrayArrays {
    public static void main(String[] args) {
        int[][] numbers = {
                {1},
                {3, 4},
                {5, 6, 7},
                {8, 9, 10, 11}
        };
        for (int[] array : numbers) {
            System.out.println("Размер вложенного массива равен: " + array.length);
        }
    }
}



