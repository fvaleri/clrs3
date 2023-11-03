package it.fvaleri.clrs3.algorithm.advanced.greedy;

import it.fvaleri.clrs3.algorithm.advanced.greedy.HuffmanCode.Character;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HuffmanCodeTest {
    private HuffmanCode cut;

    @BeforeEach
    public void beforeEach() {
        Character[] c = new Character[6];
        c[0] = new Character('a', 45);
        c[1] = new Character('b', 13);
        c[2] = new Character('c', 12);
        c[3] = new Character('d', 16);
        c[4] = new Character('e', 9);
        c[5] = new Character('f', 5);
        this.cut = new HuffmanCode(c);
    }

    @Test
    public void test() {
        assertEquals(100, cut.execute().freq);
    }
}
