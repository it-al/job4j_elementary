package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void whenCalculateFactorialFor5then120() {
        int rsl = Factorial.calc(5);
        int expected = 120;
        assertThat(expected, is(rsl));
    }

    @Test
    public void whenCalculateFactorialFor0Then1() {
        int rsl = Factorial.calc(0);
        int expected = 1;
        assertThat(expected, is(rsl));
    }
}