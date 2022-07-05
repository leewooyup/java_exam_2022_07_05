package com.wy.exam;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    @Test
    public void 더하기() {
        int rs = Calculator.run("10 + 20");
        assertEquals(30, rs);
    }

    @Test
    public void 더하기_2() {
        int rs = Calculator.run("20 + 20");
        assertEquals(40, rs);
    }

    @Test
    public void 더하기_3() {
        int rs1 = Calculator.run("10 + 10");
        assertEquals(20, rs1);
    }

    @Test
    public void 빼기() {
        int rs = Calculator.run("1 - 2");
        assertEquals(-1,rs);
    }

    @Test
    public void 빼기_2() {
        int rs = Calculator.run("20 - 30");
        assertEquals(-10, rs);
    }

    @Test
    public void 빼기_3() {
        int rs = Calculator.run("30 - 10");
        assertEquals(20, rs);
    }

}
