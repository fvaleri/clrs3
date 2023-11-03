package it.fvaleri.clrs3.algorithm.advanced.dynamic.rc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TopDownRCTest {
    private TopDownRC cut;

    @BeforeEach
    public void beforeEach() {
        this.cut = new TopDownRC();
    }

    @Test
    public void test() {
        int[] prices = { 1, 5, 8, 9, 10, 17, 17, 20, 24, 30 };
        assertEquals("0", cut.execute(prices, 0));
        assertEquals("10", cut.execute(prices, 4));
        assertEquals("0", cut.execute(prices, prices.length + 1));
    }
}
