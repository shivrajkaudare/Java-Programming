import java.util.*;

public class DepthFirstSearch {

    static class Graph {
        private int V; // Number of vertices
        private LinkedList<Integer>[] adjList; // Adjacency list representation

        // Constructor
        Graph(int v) {
            V = v;
            adjList = new LinkedList[v];
            for (int i=0; i<v; ++i)
                adjList[i] = new LinkedList();
        }

        // Function to add an edge into the graph
        void addEdge(int v, int w) {
            adjList[v].add(w); // Add w to v's list
        }

        // DFS traversal from a given source vertex
        void DFS(int v, boolean[] visited) {
            // Mark the current node as visited and print it
            visited[v] = true;
            System.out.print(v + " ");

            // Recur for all the vertices adjacent to this vertex
            Iterator<Integer> i = adjList[v].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n])
                    DFS(n, visited);
            }
        }

        // DFS traversal
        void DFS(int v) {
            boolean[] visited = new boolean[V]; // Mark all the vertices as not visited
            DFS(v, visited); // Call the recursive helper function to print DFS traversal
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
        long startTime = System.nanoTime();
        g.DFS(2);
        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;
        System.out.println("\nTime Complexity: O(V+E), where V is the number of vertices and E is the number of edges");
        System.out.println("Time taken in nanoseconds: " + timeElapsed);
    }
}

