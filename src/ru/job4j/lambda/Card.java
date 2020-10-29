package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Card {

    public enum Suit {
        Diamonds, Hearts, Spades, Clubs
    }

    public enum Value {
        V_6, V_7, V_8
    }

    private Suit suit;
    private Value value;

    public Card(Suit suit, Value value) {
        this.suit = suit;
        this.value = value;
    }

    public static void main(String[] args) {

        List<Card> cards = Stream.of(Suit.values())
                .flatMap(s -> {
                    List<Card> tmpcards = new ArrayList<>();
                    for (Value v : Value.values()) {
                        tmpcards.add(new Card(s, v));
                    }
                    return tmpcards.stream();
                })
                .collect(Collectors.toList());
    }
}