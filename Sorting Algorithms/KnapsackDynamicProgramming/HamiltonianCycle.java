import java.util.*;

public class HamiltonianCycle {

    static class Graph {
        private int V; // Number of vertices
        private LinkedList<Integer>[] adjList; // Adjacency list representation
        private boolean[] visited;

        // Constructor
        Graph(int v) {
            V = v;
            adjList = new LinkedList[v];
            for (int i = 0; i < v; ++i)
                adjList[i] = new LinkedList();
            visited = new boolean[V];
        }

        // Function to add an edge into the graph
        void addEdge(int v, int w) {
            adjList[v].add(w); // Add w to v's list
            adjList[w].add(v); // Add v to w's list
        }

        // A utility function to check if the current vertex can be added to the Hamiltonian cycle
        boolean isSafe(int v, int pos) {
            if (!adjList[v].contains(pos))
                return false;

            if (visited[pos])
                return false;

            return true;
        }

        // A recursive utility function to solve Hamiltonian cycle problem
        boolean hamCycleUtil(int[] path, int pos) {
            if (pos == V) {
                // Check if the last vertex is connected to the first vertex
                if (adjList[path[pos - 1]].contains(path[0]))
                    return true;
                else
                    return false;
            }

            for (int v = 1; v < V; v++) {
                if (isSafe(v, path[pos])) {
                    path[pos] = v;

                    // Recur to construct the rest of the path
                    if (hamCycleUtil(path, pos + 1))
                        return true;

                    // If adding vertex v doesn't lead to a solution, then remove it from the path
                    path[pos] = -1;
                }
            }
            return false;
        }

        // A utility function to check if the given graph contains a Hamiltonian cycle
        boolean hamCycle() {
            int[] path = new int[V];
            Arrays.fill(path, -1);

            // Start from vertex 0 as the source vertex
            path[0] = 0;
            if (!hamCycleUtil(path, 1)) {
                System.out.println("No Hamiltonian cycle exists.");
                return false;
            }

            // Print the Hamiltonian cycle
            System.out.println("Hamiltonian cycle exists:");
            for (int i = 0; i < V; i++)
                System.out.print(path[i] + " ");

            // Include the first vertex to show the complete cycle
            System.out.println(path[0]);
            return true;
        }
    }

    public static void main(String[] args) {
        Graph g = new Graph(5);
        g.addEdge(0, 1);
        g.addEdge(0, 3);
        g.addEdge(1, 2);
        g.addEdge(1, 4);
        g.addEdge(2, 3);
        g.addEdge(2, 4);
        g.addEdge(3, 4);

        g.hamCycle();
    }
}

