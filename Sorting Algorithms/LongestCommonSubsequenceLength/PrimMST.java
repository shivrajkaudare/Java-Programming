import java.util.*;

class Edge implements Comparable<Edge> {
    int dest, weight;

    public Edge(int dest, int weight) {
        this.dest = dest;
        this.weight = weight;
    }

    @Override
    public int compareTo(Edge other) {
        return this.weight - other.weight;
    }
}

public class PrimMST {
    private int V; // Number of vertices
    private List<List<Edge>> adjList;

    public PrimMST(int V) {
        this.V = V;
        this.adjList = new ArrayList<>(V);
        for (int i = 0; i < V; i++) {
            this.adjList.add(new ArrayList<>());
        }
    }

    public void addEdge(int src, int dest, int weight) {
        adjList.get(src).add(new Edge(dest, weight));
        adjList.get(dest).add(new Edge(src, weight)); // Assuming undirected graph
    }

    public List<Edge> primMST() {
        boolean[] visited = new boolean[V];
        PriorityQueue<Edge> pq = new PriorityQueue<>();
        List<Edge> mst = new ArrayList<>();
        
        pq.offer(new Edge(0, 0)); // Start from vertex 0
        
        while (!pq.isEmpty()) {
            Edge minEdge = pq.poll();
            int u = minEdge.dest;

            if (visited[u]) continue;

            visited[u] = true;
            mst.add(minEdge);

            for (Edge edge : adjList.get(u)) {
                if (!visited[edge.dest]) {
                    pq.offer(edge);
                }
            }
        }

        return mst;
    }

    public static void main(String[] args) {
        int V = 5;
        PrimMST graph = new PrimMST(V);
        graph.addEdge(0, 1, 2);
        graph.addEdge(0, 3, 6);
        graph.addEdge(1, 2, 3);
        graph.addEdge(1, 3, 8);
        graph.addEdge(1, 4, 5);
        graph.addEdge(2, 4, 7);
        graph.addEdge(3, 4, 9);

        List<Edge> result = graph.primMST();
        System.out.println("Edges in the Minimum Cost Spanning Tree:");
        for (Edge edge : result) {
            System.out.println("Edge " + edge.dest + " - " + edge.weight);
        }
    }
}

