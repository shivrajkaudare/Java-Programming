import java.util.*;

public class GraphColoring {

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
            adjList[w].add(v); // Add v to w's list
        }

        // Function to color the graph
        void colorGraph() {
            int[] result = new int[V]; // Stores the color assigned to each vertex
            boolean[] available = new boolean[V]; // Stores the availability of colors

            // Assign the first color to the first vertex
            result[0] = 0;

            // Initialize all colors as available
            Arrays.fill(available, true);

            // Assign colors to the remaining vertices
            for (int u = 1; u < V; u++) {
                // Process all adjacent vertices and flag their colors as unavailable
                Iterator<Integer> iterator = adjList[u].iterator();
                while (iterator.hasNext()) {
                    int v = iterator.next();
                    if (result[v] != -1) {
                        available[result[v]] = false;
                    }
                }

                // Find the first available color
                int color;
                for (color = 0; color < V; color++) {
                    if (available[color]) {
                        break;
                    }
                }

                result[u] = color; // Assign the found color to the current vertex

                // Reset the availability of colors for the next iteration
                Arrays.fill(available, true);
            }

            // Print the result
            System.out.println("Vertex   Color");
            for (int u = 0; u < V; u++) {
                System.out.println("  " + u + "      " + result[u]);
            }
        }
    }

    public static void main(String[] args) {
        int V = 5; // Number of vertices
        Graph g = new Graph(V);

        // Add edges
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 3);
        g.addEdge(3, 4);

        System.out.println("Graph Coloring:");
        g.colorGraph();
    }
}

