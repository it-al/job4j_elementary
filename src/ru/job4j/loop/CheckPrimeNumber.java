package ru.job4j.loop;

public class CheckPrimeNumber {

    public static boolean check(int number) {
        boolean primeNumber = number > 1;
        for (int i = 2; i < number; i++) {
            if ((number % i) == 0) {
                primeNumber = false;
                break;
            }
        }
        return primeNumber;
    }
}
