package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        Point a = new Point(x1, y1);
        Point b = new Point(x2, y2);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when101to31then7() {
        double expected = 7;
        int x1 = 10;
        int y1 = 1;
        int x2 = 3;
        int y2 = 1;
        Point a = new Point(x1, y1);
        Point b = new Point(x2, y2);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when12to31then2dot23() {
        double expected = 2.23;
        int x1 = 1;
        int y1 = 2;
        int x2 = 3;
        int y2 = 1;
        Point a = new Point(x1, y1);
        Point b = new Point(x2, y2);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when234to345then1dot73() {
        double expected = 1.73;
        int x1 = 2;
        int y1 = 3;
        int z1 = 4;
        int x2 = 3;
        int y2 = 4;
        int z2 = 5;
        Point a = new Point(x2, y2, z2);
        Point b = new Point(x1, y1, z1);
        double dist = a.distance3d(b);
        Assert.assertEquals(expected, dist, 0.01);
    }
}