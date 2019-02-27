package it.fvaleri.clrs3.algorithm.advanced.dynamic.rc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BottomUpRCTest {
    private BottomUpRC cut;

    @BeforeEach
    public void beforeEach() {
        this.cut = new BottomUpRC();
    }

    @Test
    public void test() {
        int[] prices = { 1, 5, 8, 9, 10, 17, 17, 20, 24, 30 };
        int size = 7;
        assertEquals("1,6", cut.execute(prices, size));
    }
}
