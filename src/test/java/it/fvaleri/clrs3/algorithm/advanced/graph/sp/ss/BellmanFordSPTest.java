package it.fvaleri.clrs3.algorithm.advanced.graph.sp.ss;

import it.fvaleri.clrs3.data.advanced.ALGraph;
import it.fvaleri.clrs3.data.advanced.Graph;
import it.fvaleri.clrs3.data.advanced.Graph.Vertex;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BellmanFordSPTest {
    private BellmanFordSP cut;

    @BeforeEach
    public void beforeEach() {
        this.cut = new BellmanFordSP();
    }

    @Test
    public void test() {
        Vertex s = new Vertex("s");
        Vertex t = new Vertex("t");
        Vertex y = new Vertex("y");
        Vertex x = new Vertex("x");
        Vertex z = new Vertex("z");

        Graph graph = new ALGraph(true);
        graph.addEdge(s, t, 6);
        graph.addEdge(s, y, 7);
        graph.addEdge(t, z, -4);
        graph.addEdge(y, x, -3);
        graph.addEdge(t, y, 8);
        graph.addEdge(t, x, 5);
        graph.addEdge(x, t, -2);
        graph.addEdge(y, z, 9);
        graph.addEdge(z, s, 2);
        graph.addEdge(z, x, 7);
        //graph.print();

        assertTrue(cut.execute(graph, s));
        assertEquals("s -> y -> x -> t", graph.pathToString(s, t));
    }
}
