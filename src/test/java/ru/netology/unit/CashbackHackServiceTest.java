package ru.netology.unit;

import org.junit.jupiter.api.Test;
import ru.netology.unit.CashbackHackService;

import static org.junit.jupiter.api.Assertions.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldGetRemain() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount=1800;
        int actual = cashbackHackService.remain(amount);
        int expected = 200;
        assertEquals(expected, actual);
    }
    @Test
    public void shouldGetRemainMore() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 3000;
        int actual = cashbackHackService.remain(amount);
        int expected = 0;
        assertEquals(expected, actual);
    }
}