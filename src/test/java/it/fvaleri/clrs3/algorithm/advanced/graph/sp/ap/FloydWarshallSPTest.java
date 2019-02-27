package it.fvaleri.clrs3.algorithm.advanced.graph.sp.ap;

import it.fvaleri.clrs3.data.advanced.AMGraph;
import it.fvaleri.clrs3.data.advanced.Graph;
import it.fvaleri.clrs3.data.advanced.Graph.Vertex;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FloydWarshallSPTest {
    private FloydWarshallSP cut;

    @BeforeEach
    public void beforeEach() {
        this.cut = new FloydWarshallSP();
    }

    @Test
    public void test() {
        Vertex v1 = new Vertex("1");
        Vertex v2 = new Vertex("2");
        Vertex v3 = new Vertex("3");
        Vertex v4 = new Vertex("4");
        Vertex v5 = new Vertex("5");

        Graph graph = new AMGraph(true);
        graph.addEdge(v1, v2, 3);
        graph.addEdge(v1, v3, 8);
        graph.addEdge(v4, v1, 2);
        graph.addEdge(v5, v4, 6);
        graph.addEdge(v1, v5, -4);
        graph.addEdge(v2, v5, 7);
        graph.addEdge(v2, v4, 1);
        graph.addEdge(v3, v2, 4);
        graph.addEdge(v4, v3, -5);
        //graph.print();

        int[][] a = { { 0, 1, -3, 2, -4 }, { 3, 0, -4, 1, -1 }, { 7, 4, 0, 5, 3 }, { 2, -1, -5, 0, -2 },
                { 8, 5, 1, 6, 0 } };

        assertEquals(Arrays.deepToString(a), Arrays.deepToString(cut.execute(graph)));
    }
}
