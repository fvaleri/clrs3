package it.fvaleri.clrs3.algorithm.advanced.dynamic.mco;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BottomUpMCOTest {
    private BottomUpMCO cut;

    @BeforeEach
    public void beforeEach() {
        this.cut = new BottomUpMCO();
    }

    @Test
    public void test() {
        int[] dimensions = { 30, 35, 15, 5, 10, 20, 25 };
        assertEquals("((A[1](A[2]A[3]))((A[4]A[5])A[6]))", cut.execute(dimensions));
    }
}
