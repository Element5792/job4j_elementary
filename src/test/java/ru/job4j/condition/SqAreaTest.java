package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        double expected = 2;
        double p = 6;
        double k = 2;
        double out = SqArea.sqarea(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP8K1Square4() {
        double expected = 4;
        double p = 8;
        double k = 1;
        double out = SqArea.sqarea(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP20K4Square16() {
        double expected = 16;
        double p = 20;
        double k = 4;
        double out = SqArea.sqarea(p,k);
        Assert.assertEquals(expected, out, 0.01);
    }

}