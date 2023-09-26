package org.example.labs;

public class KruskalMST {
    private Queue<Edge> mst;    // MST edges

    /* Perform the Kruskal's algorithm */
    public KruskalMST(EdgeWeightedGraph G) {
        mst = new Queue<Edge>();
        MinPQ<Edge> pq = new MinPQ<Edge>();

        /* Add all edges to the MST */
        for (Edge e: G.edges()) {
            pq.insert(e);
        }

        UF uf = new UF(G.V());
        while (!pq.isEmpty() && mst.size() < G.V() - 1) {
            // Get minimum weight edge on priority queue
            Edge e = pq.delMin();   // get the edge with the lowest weight
            int v = e.either();     // extract one vertex
            int w = e.other(v);     // extract the other vertex

            if (uf.connected(v, w)) {   // if the edge forms a cycle,
                continue;               // ignore it
            }
            uf.union(v, w); // ignore ineligible edges
            mst.enqueue(e); // add edge to MST
        }
    }

    /* Get a list of MST edges */
    public Iterable<Edge> edges() {
        return mst;
    }

    /* Get the weight of the MST */
    public double weight() {
        double total = 0;           // initialize
        for (Edge e: mst) {         // iterate over all MST edges
            total += e.weight();    // sum weights together
        }
        return total;               // output the weight
    }
}
