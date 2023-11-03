package it.fvaleri.clrs3.algorithm.advanced;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class KMPSearchTest {
    private KMPSearch cut;

    @BeforeEach
    public void beforeEach() {
        this.cut = new KMPSearch();
    }

    @Test
    public void validText() {
        assertEquals("[2]", cut.execute("acaabc", "aab").toString());
        assertEquals("[1, 5, 11]", cut.execute("000010001010001", "0001").toString());
        assertEquals("[]", cut.execute("abcdef", "gh").toString());
    }

    @Test
    public void emptyText() {
        assertThrows(IllegalArgumentException.class, () -> cut.execute("", "gh"));
    }

    @Test
    public void emptyPattern() {
        assertThrows(IllegalArgumentException.class, () -> cut.execute("abcdef", ""));
    }
}
