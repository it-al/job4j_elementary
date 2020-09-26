package ru.job4j.ex;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class FactTest {

    @Test(expected = IllegalArgumentException.class)
    public void whenLessThanZeroThenIllegalArgumentException() {
        Fact fact = new Fact();
        int rsl = fact.calc(-5);
    }

    @Test
    public void when5Than120() {
        Fact fact = new Fact();
        int rsl = fact.calc(5);
        assertThat(rsl, is(120));
    }

}