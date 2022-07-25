package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void remainWhenAmountIs900Test() {
        int amount = 900;
        int expected = 100;
        int actual = service.remain(amount);
        Assert.assertEquals(actual, expected, "Wrong remain with amount " + amount + ": ");
    }

    @Test
    public void remainWhenAmountIs1100Test() {
        int amount = 1100;
        int expected = 900;
        int actual = service.remain(amount);
        Assert.assertEquals(actual, expected, "Wrong remain with amount " + amount + ": ");
    }

    @Test
    public void remainWhenAmountIs1000Test() {
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        Assert.assertEquals(actual, expected, "Wrong remain with amount " + amount + ": ");
    }
}