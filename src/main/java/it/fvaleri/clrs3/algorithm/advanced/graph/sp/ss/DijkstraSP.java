package it.fvaleri.clrs3.algorithm.advanced.graph.sp.ss;

import it.fvaleri.clrs3.data.advanced.Graph;
import it.fvaleri.clrs3.data.advanced.Graph.Edge;
import it.fvaleri.clrs3.data.advanced.Graph.Vertex;
import it.fvaleri.clrs3.data.advanced.VMPQueue;

import java.util.LinkedList;
import java.util.List;

/**
 * Greedy strategy.
 * Edges can't have negative weight.
 * Can be faster if we use FibonacciHeap instead of BinaryMinHeap.
 * Runtime: O(E lg V)
 */
public class DijkstraSP extends SingleSourceSP {
    @Override
    public boolean execute(Graph g, Vertex s) {
        initialize(g, s);
        List<Vertex> done = new LinkedList<>();
        VMPQueue q = new VMPQueue(g.getVertices());
        while (!q.isEmpty()) {
            Vertex u = q.extractMin(); // min distance
            done.add(u);
            for (Edge e : g.outEdges(u)) {
                Vertex v = e.destination;
                if (relax(u, v, e.weight)) {
                    q.decreaseKey(v, v.distance);
                }
            }
        }
        return true;
    }
}
