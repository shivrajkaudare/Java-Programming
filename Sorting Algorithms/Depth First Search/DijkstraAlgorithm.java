import java.util.*;

public class DijkstraAlgorithm {

    static class Graph {
        private int V; // Number of vertices
        private List<List<Node>> adjList; // Adjacency list representation

        // Constructor
        Graph(int v) {
            V = v;
            adjList = new ArrayList<>(v);
            for (int i = 0; i < v; ++i)
                adjList.add(new ArrayList<>());
        }

        // Function to add an edge into the graph
        void addEdge(int src, int dest, int weight) {
            adjList.get(src).add(new Node(dest, weight));
            adjList.get(dest).add(new Node(src, weight)); // Undirected graph
        }

        // Dijkstra's algorithm to find shortest paths from source to all other vertices
        void dijkstra(int src) {
            PriorityQueue<Node> pq = new PriorityQueue<>(Comparator.comparingInt(node -> node.weight));
            int[] dist = new int[V];
            Arrays.fill(dist, Integer.MAX_VALUE);
            dist[src] = 0;
            pq.offer(new Node(src, 0));

            while (!pq.isEmpty()) {
                int u = pq.poll().vertex;

                for (Node neighbor : adjList.get(u)) {
                    int v = neighbor.vertex;
                    int weight = neighbor.weight;

                    if (dist[u] != Integer.MAX_VALUE && dist[u] + weight < dist[v]) {
                        dist[v] = dist[u] + weight;
                        pq.offer(new Node(v, dist[v]));
                    }
                }
            }

            printShortestPaths(dist);
        }

        // Function to print shortest paths from source
        void printShortestPaths(int[] dist) {
            System.out.println("Shortest paths from source vertex:");
            for (int i = 0; i < V; ++i)
                System.out.println("Vertex " + i + ": Distance = " + dist[i]);
        }
    }

    static class Node {
        int vertex, weight;

        Node(int vertex, int weight) {
            this.vertex = vertex;
            this.weight = weight;
        }
    }

    public static void main(String[] args) {
        int V = 5;
        Graph graph = new Graph(V);
        graph.addEdge(0, 1, 9);
        graph.addEdge(0, 2, 6);
        graph.addEdge(0, 3, 5);
        graph.addEdge(0, 4, 3);
        graph.addEdge(2, 1, 2);
        graph.addEdge(2, 3, 4);

        int sourceVertex = 0;
        graph.dijkstra(sourceVertex);
    }
}

