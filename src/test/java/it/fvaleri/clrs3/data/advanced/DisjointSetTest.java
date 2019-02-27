package it.fvaleri.clrs3.data.advanced;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

public class DisjointSetTest {
    private DisjointSet<Integer> cut;

    @BeforeEach
    public void beforeEach() {
        this.cut = new DisjointSet<>();
    }

    @Test
    public void makeSet() {
        cut.makeSet(1);
        cut.makeSet(2);
        cut.makeSet(3);
        assertEquals(3, cut.size());
    }

    @Test
    public void findSet() {
        Integer one = 1;
        cut.makeSet(one);
        assertNotNull(cut.findSet(one));
        assertNull(cut.findSet(2));
    }

    @Test
    public void union() {
        int one = 1;
        int two = 2;
        cut.makeSet(one);
        cut.makeSet(two);
        cut.union(one, two);
        assertEquals(1, cut.size());
        assertEquals("[[1, 2]]", cut.getSets().toString());
    }
}
