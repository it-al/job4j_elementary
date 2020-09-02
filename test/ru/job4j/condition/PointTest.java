package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20than2() {

        double out = Point.distance(0, 0, 2, 0);
        double expected = 2;

        Assert.assertEquals(expected, out, 0.01);

    }

    @Test
    public void when10to20than2() {

        double out = Point.distance(1, 0, 2, 0);
        double expected = 1;

        Assert.assertEquals(expected, out, 0.01);

    }

    @Test
    public void when11to20than2() {

        double out = Point.distance(1, 1, 2, 0);
        double expected = 1.414;

        Assert.assertEquals(expected, out, 0.01);

    }

    @Test
    public void when11to51than2() {

        double out = Point.distance(1, 1, 5, 1);
        double expected = 4;

        Assert.assertEquals(expected, out, 0.01);

    }
}