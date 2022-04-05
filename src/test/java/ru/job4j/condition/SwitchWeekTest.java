package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SwitchWeekTest {
    @Test
    public void mondayOfDay() {
        int monday = 1;
        String result = SwitchWeek.nameOfDay(monday);
        String expected = "Понедельник";
        Assert.assertEquals(expected, result);
    }
}