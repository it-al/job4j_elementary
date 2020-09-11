package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return  rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        int in = 140;
        int expected = 2;
        int euro = Converter.rubleToEuro(in);
        int dollar = Converter.rubleToDollar(in);
        boolean passedRubleToEuro = euro == expected;
        boolean passedRubleToDollar = dollar == expected;
        System.out.println("140 rubles are " + euro + " euro." + "Test result : " + passedRubleToEuro);
        System.out.println("140 rubles are " + dollar + " dollar." + "Test result : " + passedRubleToDollar);
    }
}
