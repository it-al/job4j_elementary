package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class CounterTest {

    @Test
    public void whenSumEvenNumbersfrom1To10then30() {
        int rsl = Counter.sumByEven(1, 10);
        int expected = 30;
        assertThat(expected, is(rsl));
    }

    @Test
    public void whenSumEvenNumbersfrom1To15then30() {
        int rsl = Counter.sumByEven(1, 15);
        int expected = 56;
        assertThat(expected, is(rsl));
    }
}