package it.fvaleri.clrs3.data.basic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinHeapTest {
    private MinHeap cut;

    @BeforeEach
    public void beforeEach() {
        int[] keys = { 1, 7, 3, 9, 5, 3, 4 };
        this.cut = new MinHeap(keys);
    }

    @Test
    public void test() {
        int[] e = { 1, 5, 3, 9, 7, 3, 4 };
        assertEquals(Arrays.toString(e), Arrays.toString(cut.keys));
        assertEquals(1, cut.parent(4));
        assertEquals(3, cut.left(1));
        assertEquals(4, cut.right(1));
    }
}
