package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;

public class Profile {
    private Address address;

    public Profile(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return this.address;
    }

    public static List<Address> collect(List<Profile> profiles) {
        return profiles.stream()
                .map(Profile::getAddress)
                .sorted(new CompAddress())
                .distinct()
                .collect(Collectors.toList());
    }
}
