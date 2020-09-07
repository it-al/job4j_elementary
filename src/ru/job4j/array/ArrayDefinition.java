package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        System.out.println("Размер массива ages равен: " + ages.length);
        System.out.println("Размер массива surnames равен: " + surnames.length);
        System.out.println("Размер массива prices равен: " + prices.length);
        String[] names = new String[4];
        names[0] = "Oleg";
        names[1] = "Petr";
        names[2] = "Vlad";
        names[3] = "Max";
        for (int i = 0; i < 4; i++) {
            System.out.println(names[i]);
        }
    }
}
