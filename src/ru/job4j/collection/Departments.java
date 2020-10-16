package ru.job4j.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Departments {

    public static List<String> fillGaps(List<String> deps) {
        List<String> rsl = new ArrayList<>();
        HashSet<String> uniqueDepartments = new HashSet<>();
        for (String departmentPath : deps) {
            uniqueDepartments.addAll(Arrays.asList(departmentPath.split("/")));
        }
        String fullPathDepartment = "";
        for (String uniqueDepartment : uniqueDepartments) {
            fullPathDepartment = fullPathDepartment + (fullPathDepartment.equals("") ? "" : "/") + uniqueDepartment;
            rsl.add(fullPathDepartment);
        }
        return rsl;
    }

    public static void sortAsc(List<String> orgs) {
        orgs.sort(new DepAscComp());
    }

    public static void sortDesc(List<String> orgs) {
        orgs.sort(new DepDescComp());
    }
}