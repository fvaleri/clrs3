package it.fvaleri.clrs3.data.basic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class QueueTest {
    private Queue<Integer> cut;

    @BeforeEach
    public void beforeEach() {
        this.cut = new Queue<Integer>(10);
    }

    @Test
    public void test() {
        assertTrue(cut.isEmpty());
        cut.enqueue(25);
        cut.enqueue(130);
        cut.enqueue(39);
        assertEquals(25, cut.dequeue().intValue());
        cut.enqueue(111);
        assertEquals(130, cut.dequeue().intValue());
        assertEquals(39, cut.dequeue().intValue());
        assertFalse(cut.isEmpty());
    }

    @Test
    public void overflow() {
        assertThrows(IllegalArgumentException.class, () -> {
            for (int i = 0; i < 12; i++) {
                cut.enqueue(3);
            }
        });
    }

    @Test
    public void underflow() {
        assertThrows(IllegalArgumentException.class, () ->cut.dequeue());
    }
}
