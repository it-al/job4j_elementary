package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        int count = 11;
        do {
            System.out.println("Введите число от 1 до 3");
            Scanner input = new Scanner(System.in);
            int answer = Integer.parseInt(input.nextLine());
            if (answer < 1 || answer > 3) {
                continue;
            }
            count = count - answer;
            System.out.println("Осталось " + count + " спичек");
        }
        while (count > 0);
    }
}
