package it.fvaleri.clrs3.algorithm.advanced.graph.mst;

import it.fvaleri.clrs3.data.advanced.Graph;
import it.fvaleri.clrs3.data.advanced.Graph.Edge;

import java.util.List;

/**
 * Minimum Spanning Tree.
 * Assuming a weighted undirected graph as input.
 */
public interface MSTProblem {
    public List<Edge> execute(Graph g);

}
