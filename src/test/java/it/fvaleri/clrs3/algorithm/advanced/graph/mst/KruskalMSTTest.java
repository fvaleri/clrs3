package it.fvaleri.clrs3.algorithm.advanced.graph.mst;

import it.fvaleri.clrs3.data.advanced.ALGraph;
import it.fvaleri.clrs3.data.advanced.Graph;
import it.fvaleri.clrs3.data.advanced.Graph.Vertex;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KruskalMSTTest {
    private KruskalMST cut;

    @BeforeEach
    public void beforeEach() {
        this.cut = new KruskalMST();
    }

    @Test
    public void test() {
        Vertex a = new Vertex("a");
        Vertex b = new Vertex("b");
        Vertex c = new Vertex("c");
        Vertex d = new Vertex("d");
        Vertex e = new Vertex("e");
        Vertex f = new Vertex("f");
        Vertex g = new Vertex("g");
        Vertex h = new Vertex("h");
        Vertex i = new Vertex("i");

        Graph graph = new ALGraph();
        graph.addEdge(a, b, 4);
        graph.addEdge(a, h, 8);
        graph.addEdge(b, h, 11);
        graph.addEdge(b, c, 8);
        graph.addEdge(h, i, 7);
        graph.addEdge(h, g, 1);
        graph.addEdge(i, c, 2);
        graph.addEdge(i, g, 6);
        graph.addEdge(c, d, 7);
        graph.addEdge(c, f, 4);
        graph.addEdge(g, f, 2);
        graph.addEdge(d, e, 9);
        graph.addEdge(d, f, 14);
        graph.addEdge(e, f, 10);
        //graph.print();

        assertEquals("[(h, g, 1), (c, i, 2), (g, f, 2), (a, b, 4), (c, f, 4), (c, d, 7), (a, h, 8), (d, e, 9)]",
                cut.execute(graph).toString());
    }
}
