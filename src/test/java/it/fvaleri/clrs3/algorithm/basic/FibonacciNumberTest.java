package it.fvaleri.clrs3.algorithm.basic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FibonacciNumberTest {
    private FibonacciNumber cut;

    @BeforeEach
    public void beforeEach() {
        this.cut = new FibonacciNumber();
    }

    @Test
    public void correct() {
        assertEquals(8, cut.execute(6));
    }

    @Test
    public void invalid() {
        assertThrows(IllegalArgumentException.class, () -> cut.execute(-6));
    }
}
