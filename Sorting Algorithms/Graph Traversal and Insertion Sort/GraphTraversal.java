import java.util.*;

public class GraphTraversal {

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

        // DFS traversal from a given source vertex
        void DFS(int v) {
            boolean[] visited = new boolean[V]; // Mark all the vertices as not visited
            DFSUtil(v, visited);
        }

        // Recursive function to do DFS traversal
        void DFSUtil(int v, boolean[] visited) {
            visited[v] = true; // Mark the current node as visited and print it
            System.out.print(v + " ");

            // Recur for all the vertices adjacent to this vertex
            Iterator<Integer> i = adjList[v].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n])
                    DFSUtil(n, visited);
            }
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

                // Get all adjacent vertices of the dequeued vertex s
                Iterator<Integer> i = adjList[s].listIterator();
                while (i.hasNext()) {
                    int n = i.next();
                    // If adjacent vertex n is not visited, mark it visited and enqueue it
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

        System.out.println("Depth First Traversal (starting from vertex 2): ");
        long startTimeDFS = System.nanoTime();
        g.DFS(2);
        long endTimeDFS = System.nanoTime();
        long timeElapsedDFS = endTimeDFS - startTimeDFS;
        System.out.println("\nTime taken for DFS in nanoseconds: " + timeElapsedDFS);

        System.out.println("\nBreadth First Traversal (starting from vertex 2): ");
        long startTimeBFS = System.nanoTime();
        g.BFS(2);
        long endTimeBFS = System.nanoTime();
        long timeElapsedBFS = endTimeBFS - startTimeBFS;
        System.out.println("\nTime taken for BFS in nanoseconds: " + timeElapsedBFS);
    }
}

