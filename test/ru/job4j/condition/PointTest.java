package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20than2() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double out = b.distance(a);
        double expected = 2;
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when10to20than2() {
        Point a = new Point(1, 0);
        Point b = new Point(2, 0);
        double out = b.distance(a);
        double expected = 1;
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when11to20than2() {
        Point a = new Point(1, 1);
        Point b = new Point(2, 0);
        double out = b.distance(a);
        double expected = 1.414;
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when11to51than2() {
        Point a = new Point(1, 1);
        Point b = new Point(5, 1);
        double out = b.distance(a);
        double expected = 4;
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when112to819than9and89() {
        Point a = new Point(1, 1, 2);
        Point b = new Point(8, 1,9);
        double out = b.distance3d(a);
        double expected = 9.89;
        Assert.assertEquals(expected, out, 0.01);
    }
}