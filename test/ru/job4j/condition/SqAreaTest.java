package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void squareP6K4Then2() {
        int p = 6;
        int k = 4;
        double expected = 1.44;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void squareP5K8Then2() {
        int p = 5;
        int k = 8;
        double expected = 0.617;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void squareP12K6Then2() {
        int p = 12;
        int k = 6;
        double expected = 4.408;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

}