package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SquareTest {
    @Test
    public void whenBount3Then014() {
        int bound = 3;
        int[] rst = Square.calculate(bound);
        int[] expect = new int[]{0, 1, 4};
        assertThat(rst, is(expect));
    }

    @Test
    public void whenBount5Then0149() {
        int bound = 4;
        int[] rst = Square.calculate(bound);
        int[] expect = new int[]{0, 1, 4, 9};
        assertThat(rst, is(expect));
    }
}