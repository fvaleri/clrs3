package it.fvaleri.clrs3.data.basic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinPriorityQueueTest {
    private MinPriorityQueue cut;

    @BeforeEach
    public void beforeEach() {
        int[] keys = { 1, 7, 3, 9, 5, 3, 4 };
        this.cut = new MinPriorityQueue(keys);
    }

    @Test
    public void minimum() {
        assertEquals(1, cut.minimum());
    }

    @Test
    public void extractMin() {
        assertEquals(1, cut.extractMin());
        assertEquals("[3, 5, 3, 9, 7, 4]", cut.toString());
    }

    @Test
    public void increaseKey() {
        cut.decreaseKey(5, 2);
        assertEquals("[1, 5, 2, 9, 7, 3, 4]", cut.toString());
    }

    @Test
    public void insert() {
        cut.extractMin();
        cut.insert(2);
        assertEquals("[2, 5, 3, 9, 7, 4, 3]", cut.toString());
    }
}
