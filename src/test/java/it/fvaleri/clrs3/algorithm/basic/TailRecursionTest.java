package it.fvaleri.clrs3.algorithm.basic;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TailRecursionTest {
    private TailRecursion cut;

    @Before
    public void setUp() {
        this.cut = new TailRecursion();
    }

    @Test
    public void factorialOK() {
        assertEquals(120, cut.factorial(5).intValue());
    }

    @Test(expected = StackOverflowError.class)
    public void factorialKO() {
        cut.factorial(500000);
    }
}
