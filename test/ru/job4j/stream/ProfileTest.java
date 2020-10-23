package ru.job4j.stream;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ProfileTest {
    private List<Profile> profiles = new ArrayList<>();

    @Before
    public void setUp() {
        profiles.add(new Profile(new Address("Krasnodar", "Krasnay", 15, 40)));
    }

    @Test
    public void whenAddressTest() {
        List<Address> rsl = Profile.collect(profiles);
        List<Address> expected = new ArrayList<>();
        expected.add(new Address("Krasnodar", "Krasnay", 15, 40));
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenUniqueAddressTest() {
        profiles.add(new Profile(new Address("Krasnodar", "Krasnay", 15, 40)));
        profiles.add(new Profile(new Address("Krasnodar", "Krasnay", 15, 40)));
        profiles.add(new Profile(new Address("London", "Krasnay", 15, 40)));
        List<Address> rsl = Profile.collect(profiles);
        List<Address> expected = new ArrayList<>();
        expected.add(new Address("Krasnodar", "Krasnay", 15, 40));
        expected.add(new Address("London", "Krasnay", 15, 40));
        assertThat(rsl, is(expected));
    }
}