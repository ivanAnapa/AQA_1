package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void remainWhenAmountIs900Test() {
        int expected = 100;
        int actual = service.remain(900);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void remainWhenAmountIs1100Test() {
        int expected = 900;
        int actual = service.remain(1100);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void remainWhenAmountIs1000Test() {
        int expected = 0;
        int actual = service.remain(1000);
        Assert.assertEquals(actual, expected);
    }
}