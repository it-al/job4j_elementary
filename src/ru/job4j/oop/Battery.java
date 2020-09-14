package ru.job4j.oop;

public class Battery {
    private int load;

    public void exchange(Battery another) {
        this.load -= another.load;
        another.load += another.load;
    }

    public static void main(String[] args) {
        Battery oneBattery = new Battery();
        oneBattery.load = 15;
        Battery secondBattery = new Battery();
        secondBattery.load = 20;
        secondBattery.exchange(oneBattery);
    }
}
