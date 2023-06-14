package ru.netology.service;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

 @Test
    public void needToBuyMinLimit() {
        CashbackHackService service = new CashbackHackService();

        assertEquals(1, service.remain(999));

    }
    @Test
    public void needToBuyMaxLimit() {
        CashbackHackService service = new CashbackHackService();

        assertEquals(999, service.remain(1001));

    }
    @Test
    public void needToBuyNullLimit() {
        CashbackHackService service = new CashbackHackService();

        assertEquals(0, service.remain(1000));

    }
}