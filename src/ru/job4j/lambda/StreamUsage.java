package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toCollection;

public class StreamUsage {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new Random()
                .ints(-20, 20)
                .limit(100)
                .boxed()
                .distinct()
                .collect(toCollection(ArrayList::new));
        List<Integer> filteredList = arrayList.stream().filter(s -> s > 0).collect(Collectors.toList());
        filteredList.forEach(System.out::println);
    }
}
