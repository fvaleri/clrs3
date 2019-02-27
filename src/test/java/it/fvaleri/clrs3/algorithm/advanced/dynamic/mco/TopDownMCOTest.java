package it.fvaleri.clrs3.algorithm.advanced.dynamic.mco;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TopDownMCOTest {
    private TopDownMCO cut;

    @BeforeEach
    public void beforeEach() {
        this.cut = new TopDownMCO();
    }

    @Test
    public void test() {
        int[] dimensions = { 30, 35, 15, 5, 10, 20, 25 };
        assertEquals("15125", cut.execute(dimensions));
    }
}
