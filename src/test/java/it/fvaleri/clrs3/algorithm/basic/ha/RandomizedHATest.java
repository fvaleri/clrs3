package it.fvaleri.clrs3.algorithm.basic.ha;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class RandomizedHATest {
    private RandomizedHA cut;

    @BeforeEach
    public void beforeEach() {
        this.cut = new RandomizedHA();
    }

    @Test
    public void test() {
        int[] a = { 5, 2, 4, 6, 1, 3 };
        int r = cut.execute(a);
        assertTrue(r >= 0);
        assertTrue(r <= a.length);
    }
}
