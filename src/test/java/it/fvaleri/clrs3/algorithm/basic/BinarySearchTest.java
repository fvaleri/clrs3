package it.fvaleri.clrs3.algorithm.basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearchTest {
    @Test
    public void test() {
        int[] a = new int[] { 1, 2, 3, 3, 7, 8, 10 };
        assertEquals(1, BinarySearch.indexOf(a, 2));
        assertEquals(3, BinarySearch.indexOf(a, 3));
        assertEquals(-1, BinarySearch.indexOf(a, 100));
    }
}
