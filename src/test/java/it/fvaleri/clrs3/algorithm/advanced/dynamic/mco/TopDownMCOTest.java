package it.fvaleri.clrs3.algorithm.advanced.dynamic.mco;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TopDownMCOTest {
    private TopDownMCO cut;

    @Before
    public void setUp() {
        this.cut = new TopDownMCO();
    }

    @Test
    public void test() {
        int[] dimensions = { 30, 35, 15, 5, 10, 20, 25 };
        assertEquals("15125", cut.execute(dimensions));
    }
}
