package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                for (int j = 0; j < array.length; j++) {
                    if (array[j] == null) {
                        array = swapElementOfStringArray(array, j, i);
                    }
                }
            }
            System.out.print(array[i] + " ");
        }
        return array;
    }

    public static String[] swapElementOfStringArray(String[] array, int source, int dest) {
        String temp;
        temp = array[source];
        array[source] = array[dest];
        array[dest] = temp;
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (String s : compressed) {
            System.out.print(s + " ");
        }
    }
}
