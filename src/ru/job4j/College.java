package ru.job4j;

import ru.job4j.pojo.Student;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Никитин Алексей Сергеевич");
        student.setGroup("а1");
        try {
            student.setReceiptDate(new SimpleDateFormat("dd/MM/yyyy").parse("31/12/1998"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("FullName: " + student.getFullName() + System.lineSeparator()
                + "Group: " + student.getGroup() + System.lineSeparator()
                + "ReceiptDate: " + student.getReceiptDate());

    }
}