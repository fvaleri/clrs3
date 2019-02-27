package it.fvaleri.clrs3.data.advanced;

import it.fvaleri.clrs3.data.advanced.Graph.Vertex;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VMPQueueTest {
    private VMPQueue cut;

    @Test
    public void test() {
        Vertex a = new Vertex("a");
        Vertex b = new Vertex("b");
        Vertex c = new Vertex("c");
        Vertex d = new Vertex("d");
        Vertex e = new Vertex("e");
        a.key = 23;
        b.key = 5;
        c.key = 100;
        d.key = 10;
        cut = new VMPQueue(Arrays.asList(a, b, c, d));
        assertTrue(cut.hasVertex(a));
        assertFalse(cut.hasVertex(e));
        cut.decreaseKey(c, 1);
        assertEquals(c, cut.extractMin());
        assertEquals(b, cut.extractMin());
    }
}
