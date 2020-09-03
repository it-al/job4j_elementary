package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.Matchers.is;

public class MiltiMaxTest {

    @Test
    public void thenSecondMax() {
        int result = MultiMax.max(1, 4, 2);
        Assert.assertThat(result, is(4));
    }

    @Test
    public void thenFirstMax() {
        int result = MultiMax.max(10, 4, 2);
        Assert.assertThat(result, is(10));
    }

    @Test
    public void thenThirhMax() {
        int result = MultiMax.max(1, 4, 15);
        Assert.assertThat(result, is(15));
    }
}