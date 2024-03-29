package it.fvaleri.clrs3.algorithm.basic.sort;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QuickSortTest {
    private QuickSort cut;

    @BeforeEach
    public void beforeEach() {
        this.cut = new QuickSort();
    }

    @Test
    public void naturals() {
        int[] a = { 31, 41, 134, 26, 41, 58 };
        int[] e = { 26, 31, 41, 41, 58, 134 };
        assertEquals(Arrays.toString(e), Arrays.toString(cut.execute(a)));
    }

    @Test
    public void integers() {
        int[] a = { -5, 8, 150, 0, -348, -2, 45 };
        int[] e = { -348, -5, -2, 0, 8, 45, 150 };
        assertEquals(Arrays.toString(e), Arrays.toString(cut.execute(a)));
    }
}
