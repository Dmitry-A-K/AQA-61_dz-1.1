package ru.netology;

import org.testng.annotations.Test;
import org.testng.Assert;

public class CashbackHackServiceTest {

    @Test
    public void ifLessAmount() {
        CashbackHackService pay = new CashbackHackService();
        int payment = 999;

        int actual = pay.remain(payment);
        int expected = 1;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void ifMoreAmount() {
        CashbackHackService pay = new CashbackHackService();
        int payment = 1001;

        int actual = pay.remain(payment);
        int expected = 999;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void ifSameAmount() {
        CashbackHackService pay = new CashbackHackService();
        int payment = 1000;

        int actual = pay.remain(payment);
        int expected = 1000;

        Assert.assertEquals(actual, expected);
    }
}
