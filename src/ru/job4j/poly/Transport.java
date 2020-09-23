package ru.job4j.poly;

public interface Transport {
    void go();

    void setPassengers(int passengers);

    int refuel(int fuel);
}
