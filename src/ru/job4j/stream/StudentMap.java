package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentMap {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student(50, "Petrov"),
                new Student(50, "Petrov"),
                new Student(50, "Ivanov")
        );
        Map<String, Student> studentsMap = students.stream()
                .collect(Collectors.toMap(Student::getSurname,
                        student -> student,
                        (t, t2) -> t.getScore() > t2.getScore() ? t : t2));
        studentsMap.forEach((s, v) -> System.out.println(v.getSurname()));
    }
}

