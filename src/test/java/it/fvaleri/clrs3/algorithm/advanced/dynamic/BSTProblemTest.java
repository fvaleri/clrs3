package it.fvaleri.clrs3.algorithm.advanced.dynamic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class BSTProblemTest {
    private BSTProblem cut;

    @BeforeEach
    public void beforeEach() {
        this.cut = new BSTProblem();
    }

    @Test
    public void test() {
        double[] keysDistrib = { 0.15, 0.10, 0.05, 0.10, 0.20 };
        double[] leafsDistrib = { 0.05, 0.10, 0.05, 0.05, 0.05, 0.10 };
        double expSearchCost = cut.execute(keysDistrib, leafsDistrib);
        assertTrue(2.75 == expSearchCost);
    }
}
