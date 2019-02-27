package it.fvaleri.clrs3.algorithm.advanced.greedy.as;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RecursiveASTest {
    private RecursiveAS cut;

    @BeforeEach
    public void beforeEach() {
        this.cut = new RecursiveAS();
    }

    @Test
    public void test() {
        int[] s = { 0, 1, 3, 0, 5, 3, 5, 6, 8, 8, 2, 12 };
        int[] f = { 0, 4, 5, 6, 7, 9, 9, 10, 11, 12, 14, 16 };
        assertEquals("1 4 8 11", cut.execute(s, f));
    }
}
