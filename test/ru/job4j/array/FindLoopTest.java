package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {
    @Test
    public void whenArrayHas5When0() {
        int[] input = {5, 4, 3, 2};
        int value = 5;
        int result = FindLoop.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas5whenNotFound() {
        int[] input = {5, 15, 20, 25};
        int value = 100;
        int result = FindLoop.indexOf(input, value);
        int expect = -1;
        assertThat(expect, is(result));
    }
}