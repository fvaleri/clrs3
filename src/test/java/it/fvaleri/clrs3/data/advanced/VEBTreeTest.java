package it.fvaleri.clrs3.data.advanced;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class VEBTreeTest {
    private VEBTree cut;

    @BeforeEach
    public void beforeEach() {
        this.cut = new VEBTree(17);
        cut.insert(2);
        cut.insert(3);
        cut.insert(4);
        cut.insert(5);
        cut.insert(7);
        cut.insert(14);
        cut.insert(15);
    }

    @Test
    public void minimum() {
        assertEquals(2, cut.minimum());
    }

    @Test
    public void maximum() {
        assertEquals(15, cut.maximum());
    }

    @Test
    public void member() {
        assertTrue(cut.member(5));
        assertFalse(cut.member(6));
    }

    @Test
    public void successor() {
        assertEquals(15, cut.successor(14));
    }

    @Test
    public void predecessor() {
        assertEquals(7, cut.predecessor(14));
    }

    @Test
    public void insert() {
        //cut.printTree();
        assertFalse(cut.member(6));
        cut.insert(6);
        //cut.printTree();
        assertTrue(cut.member(6));
    }

    @Test
    public void delete() {
        assertTrue(cut.member(5));
        cut.delete(5);
        assertFalse(cut.member(5));
    }
}
