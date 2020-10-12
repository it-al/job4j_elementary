package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int rsl = 0;
        int length = Math.max(left.length(), right.length());
        for (int i = 0; i < length && rsl == 0; i++) {
            Character leftChar = (left.length() <= i) ? Character.MIN_VALUE : left.charAt(i);
            Character rigthChar = (right.length() <= i) ? Character.MIN_VALUE : right.charAt(i);
            rsl = Character.compare(leftChar, rigthChar);
        }
        return rsl;
    }
}