package ru.job4j.condition;

public class MultiMax {

    public static int max(int first, int second, int third) {
        int maxTwoNumbers = first > second ? first : second;
        return third > maxTwoNumbers ? third : maxTwoNumbers;

    }
}
