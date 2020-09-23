package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        int count = 11;
        int countPlayer = 2;
        do {
            for (int i = 1; i <= countPlayer && count > 0; i++) {
                System.out.println("Игрок " + i + " введите число от 1 до 3");
                Scanner input = new Scanner(System.in);
                int answer = Integer.parseInt(input.nextLine());
                if (answer < 1 || answer > 3) {
                    continue;
                }
                count = count - answer;
                if (count > 0) {
                    System.out.println("Осталось " + count + " спичек");
                } else {
                    System.out.println("Выграл игрок " + i);
                }
            }
        }
        while (count > 0);
    }
}