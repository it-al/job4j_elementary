package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        int rsl = 0;
        String[] departmentArray1 = o1.split("/");
        String[] departmentArray2 = o2.split("/");
        rsl = departmentArray2[0].compareTo(departmentArray1[0]);
        if (rsl == 0) {
            rsl = o1.compareTo(o2);
        }
        return rsl;
    }
}
