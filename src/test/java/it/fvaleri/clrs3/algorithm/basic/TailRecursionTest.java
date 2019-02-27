package it.fvaleri.clrs3.algorithm.basic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TailRecursionTest {
    private TailRecursion cut;

    @BeforeEach
    public void beforeEach() {
        this.cut = new TailRecursion();
    }

    @Test
    public void factorialOK() {
        assertEquals(120, cut.factorial(5).intValue());
    }

    @Test
    public void factorialKO() {
        assertThrows(StackOverflowError.class, () -> cut.factorial(500000));
    }
}
