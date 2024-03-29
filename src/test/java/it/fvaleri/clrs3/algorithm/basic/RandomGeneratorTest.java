package it.fvaleri.clrs3.algorithm.basic;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RandomGeneratorTest {
    @Test
    public void randomMinMax() {
        int min = 100;
        int max = 200;
        for (int i = 0; i < 100; i++) {
            int result = RandomGenerator.random(min, max);
            assertTrue(result >= min);
            assertTrue(result <= max);
        }
    }

    @Test
    public void randomizeArray() {
        int[] a = { 1, 2, 3, 4 };
        int[] copy = Arrays.copyOf(a, a.length);
        RandomGenerator.randomize(a);
        assertNotEquals(copy, a);
    }
}
