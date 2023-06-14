package ru.netology.service;


import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {

 @Test
    public void needToBuyMinLimit() {
        CashbackHackService service = new CashbackHackService();

        assertEquals(service.remain(999), 1);

    }
    @Test
    public void needToBuyMaxLimit() {
        CashbackHackService service = new CashbackHackService();

        assertEquals(service.remain(1001), 999);

    }
    @Test
    public void needToBuyNullLimit() {
        CashbackHackService service = new CashbackHackService();

        assertEquals(service.remain(1000), 0);

    }
}