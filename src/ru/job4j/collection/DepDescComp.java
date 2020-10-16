package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        int rsl = 0;
        String[] departmentArray1 = o1.split("/");
        String[] departmentArray2 = o2.split("/");
        int minLength = Math.min(departmentArray1.length, departmentArray2.length);
        for (int i = 0; i < minLength; i++) {
            if (i == 0) {
                rsl = departmentArray2[i].compareTo(departmentArray1[i]);
            } else {
                rsl = departmentArray1[i].compareTo(departmentArray2[i]);
            }
            if (rsl != 0) {
                break;
            }
        }
        if (rsl == 0) {
            rsl = departmentArray1.length - departmentArray2.length;
        }
        return rsl;
    }
}
