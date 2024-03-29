package it.fvaleri.clrs3.algorithm.advanced.graph.mf;

import it.fvaleri.clrs3.data.advanced.ALGraph;
import it.fvaleri.clrs3.data.advanced.Graph;
import it.fvaleri.clrs3.data.advanced.Graph.Vertex;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EdmondsKarpMFTest {
    private EdmondsKarpMF cut;

    @BeforeEach
    public void beforeEach() {
        this.cut = new EdmondsKarpMF();
    }

    @Test
    public void test() {
        Vertex s = new Vertex("s");
        Vertex v1 = new Vertex("v1");
        Vertex v2 = new Vertex("v2");
        Vertex v3 = new Vertex("v3");
        Vertex v4 = new Vertex("v4");
        Vertex t = new Vertex("t");

        Graph graph = new ALGraph(true);
        graph.addEdge(s, v1, 16);
        graph.addEdge(s, v2, 13);
        graph.addEdge(v1, v3, 12);
        graph.addEdge(v2, v4, 14);
        graph.addEdge(v2, v1, 4);
        graph.addEdge(v3, v2, 9);
        graph.addEdge(v4, v3, 7);
        graph.addEdge(v3, t, 20);
        graph.addEdge(v4, t, 4);
        //graph.print();

        assertEquals(23, cut.execute(graph, s, t));
    }
}
