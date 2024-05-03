import java.util.*;

public class BreadthFirstSearch {

    static class Graph {
        private int V; // Number of vertices
        private LinkedList<Integer>[] adjList; // Adjacency list representation

        // Constructor
        Graph(int v) {
            V = v;
            adjList = new LinkedList[v];
            for (int i = 0; i < v; ++i)
                adjList[i] = new LinkedList();
        }

        // Function to add an edge into the graph
        void addEdge(int v, int w) {
            adjList[v].add(w); // Add w to v's list
        }

        // BFS traversal from a given source vertex
        void BFS(int s) {
            boolean[] visited = new boolean[V]; // Mark all the vertices as not visited
            LinkedList<Integer> queue = new LinkedList<>(); // Create a queue for BFS

            visited[s] = true;
            queue.add(s);

            while (queue.size() != 0) {
                s = queue.poll(); // Dequeue a vertex from queue and print it
                System.out.print(s + " ");

                Iterator<Integer> i = adjList[s].listIterator(); // Get all adjacent vertices of the dequeued vertex s
                while (i.hasNext()) {
                    int n = i.next(); // If adjacent vertex n is not visited, mark it visited and enqueue it
                    if (!visited[n]) {
                        visited[n] = true;
                        queue.add(n);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Graph g = new Graph(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("Breadth First Traversal (starting from vertex 2): ");
        long startTime = System.nanoTime();
        g.BFS(2);
        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;
        System.out.println("\nTime Complexity: O(V+E), where V is the number of vertices and E is the number of edges");
        System.out.println("Time taken in nanoseconds: " + timeElapsed);
    }
}

