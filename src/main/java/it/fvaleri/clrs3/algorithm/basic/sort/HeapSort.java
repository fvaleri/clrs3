package it.fvaleri.clrs3.algorithm.basic.sort;

import it.fvaleri.clrs3.data.basic.MaxHeap;

/**
 * Iterative, in-place (asymptotically optimal).
 * Use max-heap data structure.
 * Runtime: O(n lg n)
 */
public class HeapSort extends SortProblem {
    @Override
    public int[] execute(int[] a) {
        MaxHeap maxHeap = new MaxHeap(a);
        for (int i = maxHeap.size - 1; i >= 0; i--) {
            swap(a, 0, i);
            maxHeap.size--;
            maxHeap.heapify(0);
        }
        return a;
    }
}
