package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax5To1Then5() {
        int result = Max.max(5, 1);
        assertThat(result, is(5));
    }

    @Test
    public void whenMax5To5Then5() {
        int result = Max.max(5, 5);
        assertThat(result, is(5));
    }

    @Test
    public void whenNumbers5and8and14and90ThenMax90() {
        int result = Max.max(5, 8, 14, 90);
        assertThat(result, is(90));
    }
}