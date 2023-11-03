package it.fvaleri.clrs3.algorithm.basic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SelectionProblemTest {
    private SelectionProblem cut;

    @BeforeEach
    public void beforeEach() {
        this.cut = new SelectionProblem();
    }

    @Test
    public void test() {
        int[] a = { 1, 7, 3, 0, 5, 3, 4 };
        assertEquals(4, cut.execute(a, 5));
    }
}
