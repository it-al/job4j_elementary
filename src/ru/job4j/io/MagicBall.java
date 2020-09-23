package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        String answerString;
        System.out.print("Я великий Оракул. Что ты хочешь узнать? ");
        Scanner input = new Scanner(System.in);
        String question = input.nextLine();
        int answer = new Random().nextInt(3);
        switch (answer) {
            case 0 -> {
                answerString = "Да";
            }
            case 1 -> {
                answerString = "Нет";
            }
            case 2 -> {
                answerString = "Может быть";
            }
            default -> {
                throw new IllegalStateException("Unexpected value: " + answer);
            }
        }
        System.out.print(answerString);
    }
}
