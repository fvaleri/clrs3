package it.fvaleri.clrs3.algorithm.advanced.graph.sp.ss;

import it.fvaleri.clrs3.data.advanced.ALGraph;
import it.fvaleri.clrs3.data.advanced.Graph;
import it.fvaleri.clrs3.data.advanced.Graph.Vertex;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DijkstraSPTest {
    private DijkstraSP cut;

    @BeforeEach
    public void beforeEach() {
        this.cut = new DijkstraSP();
    }

    @Test
    public void test() {
        Vertex s = new Vertex("s");
        Vertex t = new Vertex("t");
        Vertex x = new Vertex("x");
        Vertex y = new Vertex("y");
        Vertex z = new Vertex("z");

        Graph graph = new ALGraph(true);
        graph.addEdge(s, t, 10);
        graph.addEdge(s, y, 5);
        graph.addEdge(t, x, 1);
        graph.addEdge(y, z, 2);
        graph.addEdge(t, y, 2);
        graph.addEdge(y, t, 3);
        graph.addEdge(x, z, 4);
        graph.addEdge(z, x, 6);
        graph.addEdge(y, x, 9);
        graph.addEdge(z, s, 7);
        //graph.print();

        cut.execute(graph, s);
        assertEquals("s -> y -> t -> x", graph.pathToString(s, x));
    }
}
