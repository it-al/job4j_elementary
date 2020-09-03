package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.core.Is.is;

public class TriangleTest {

    @Test
    public void whenExist() {
        boolean result =  Triangle.exist(2.0, 2.0, 2.0);
        Assert.assertThat(result, is(true));
    }

    @Test
    public void whenNotExist() {
        boolean result =  Triangle.exist(77.0, 2.0, 2.0);
        Assert.assertThat(result, is(false));
    }
}