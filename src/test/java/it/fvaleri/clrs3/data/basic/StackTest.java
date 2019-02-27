package it.fvaleri.clrs3.data.basic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StackTest {
    private Stack cut;

    @BeforeEach
    public void beforeEach() {
        this.cut = new Stack(10);
    }

    @Test
    public void test() {
        assertTrue(cut.isEmpty());
        cut.push(25);
        cut.push(130);
        cut.push(39);
        assertEquals(39, cut.pop());
        cut.push(111);
        assertEquals(111, cut.pop());
        assertEquals(130, cut.pop());
        assertFalse(cut.isEmpty());
        cut.multiPop(10);
        assertTrue(cut.isEmpty());
    }

    @Test
    public void overflow() {
        assertThrows(IllegalArgumentException.class, () -> {
            for (int i = 0; i < 11; i++) {
                cut.push(3);
            }
        });
    }

    @Test
    public void underflow() {
        assertThrows(IllegalArgumentException.class, () -> cut.pop());
    }
}
