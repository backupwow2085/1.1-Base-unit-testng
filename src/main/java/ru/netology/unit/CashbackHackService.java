package ru.netology.unit;

import org.junit.Assert;
import org.junit.Test;
import ru.netology.unit.CashbackHackService;

public class CashbackHackServiceTest {

    @Test
    public void shouldReturn100WhenAmount900() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(900);
        int expected = 100;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn0WhenAmount1000() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1000);
        int expected = 0;

        Assert.assertEquals(expected, actual);
    }
}
