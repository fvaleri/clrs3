package it.fvaleri.clrs3.algorithm.advanced.dynamic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Knap01ProblemTest {
    private Knap01Problem cut;

    @BeforeEach
    public void beforeEach() {
        this.cut = new Knap01Problem();
    }

    @Test
    public void test1() {
        int v[] = { 10, 40, 30, 50 };
        int w[] = { 5, 4, 6, 3 };
        int m = 10;
        assertEquals(90, cut.execute(v, w, m));
    }

    @Test
    public void test2() {
        int[] v = { 60, 100, 120 };
        int[] w = { 10, 20, 30 };
        int m = 50;
        assertEquals(220, cut.execute(v, w, m));
    }

    @Test
    public void test3() {
        int[] v = { 70, 80, 140, 150 };
        int[] w = { 15, 20, 30, 35 };
        int m = 60;
        assertEquals(230, cut.execute(v, w, m));
    }
}
