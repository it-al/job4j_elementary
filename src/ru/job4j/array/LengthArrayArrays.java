package ru.job4j.array;

public class LengthArrayArrays {
    public static void main(String[] args) {
        int[][][][] numbers =
                {{{{1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}}, {{1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}}}};
        for (int[][][] array3: numbers) {
            System.out.println("Размер вложенного массива равен: " + array3.length);
            for (int[][] array2 : array3) {
                System.out.println("Размер вложенного массива равен: " + array2.length);
                for (int[] array1 : array2) {
                    System.out.println("Размер вложенного массива равен: " + array1.length);
                }
            }
        }
    }
}



