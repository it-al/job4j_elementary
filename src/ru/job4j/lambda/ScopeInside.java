package ru.job4j.lambda;

import java.util.function.BinaryOperator;

public class ScopeInside {

    public static void main(String[] args) {
        int[] number = {1, 2, 3};
        int total = 0;
        BinaryOperator<Integer> calc = (integer, integer2) -> integer + integer2;
        for (int i = 0; i < number.length; i++) {
            int num = number[i];
            total = calc.apply(total, num);
        }
        System.out.println(total);
    }
}