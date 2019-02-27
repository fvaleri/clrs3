package it.fvaleri.clrs3.data.basic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxHeapTest {
    private MaxHeap cut;

    @BeforeEach
    public void beforeEach() {
        int[] keys = { 1, 7, 3, 9, 5, 3, 4 };
        this.cut = new MaxHeap(keys);
    }

    @Test
    public void test() {
        int[] e = { 9, 7, 4, 1, 5, 3, 3 };
        assertEquals(Arrays.toString(e), Arrays.toString(cut.keys));
        assertEquals(1, cut.parent(4));
        assertEquals(3, cut.left(1));
        assertEquals(4, cut.right(1));
    }
}
