package it.fvaleri.clrs3.algorithm.advanced.dynamic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LCSProblemTest {
    private LCSProblem cut;

    @BeforeEach
    public void beforeEach() {
        this.cut = new LCSProblem();
    }

    @Test
    public void test() {
        String x = "ABCBDAB";
        String y = "BDCABA";
        assertEquals("BCBA", cut.execute(x, y));
    }
}
