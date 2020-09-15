package ru.job4j.sort;

import java.util.Arrays;

public class Machine {
    private final int[] coins = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0;
        while (money - price > 0) {
            for (int i = 0; i < coins.length; i++) {
                while ((money - price) / coins[i] > 0) {
                    rsl[size] = coins[i];
                    money -= coins[i];
                    size += 1;
                }
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
