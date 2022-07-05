package com.wy.exam;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    @Test
    public void 더하기() {
        int rs = Calculator.add("10 + 20");
        assertEquals(30, rs);
    }

    @Test
    public void 더하기_2() {
        int rs = Calculator.add("20 + 20");
        assertEquals(40, rs);
    }

    @Test
    public void 더하기_3() {
        int rs1 = Calculator.add("10 + 10");
        assertEquals(20, rs1);
    }
}
