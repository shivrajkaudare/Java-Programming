import java.util.*;

public class GraphColoring {
    private int V; // Number of vertices
    private LinkedList<Integer>[] adj; // Adjacency list representation

    public GraphColoring(int v) {
        V = v;
        adj = new LinkedList[V];
        for (int i = 0; i < V; ++i)
            adj[i] = new LinkedList();
    }

    // Function to add an edge into the graph
    public void addEdge(int v, int w) {
        adj[v].add(w);
        adj[w].add(v); // Assuming undirected graph
    }

    // Function to color the vertices of the graph
    public void colorGraph() {
        int[] result = new int[V]; // Stores the color assigned to each vertex
        boolean[] available = new boolean[V]; // To keep track of available colors for each vertex
        Arrays.fill(result, -1); // Initialize all vertices as unassigned

        // Assign the first color to the first vertex
        result[0] = 0;

        // Assign colors to remaining V-1 vertices
        for (int u = 1; u < V; u++) {
            // Initialize the available colors for vertex u
            Arrays.fill(available, true);

            // Traverse all adjacent vertices and mark their colors as unavailable
            for (Integer v : adj[u]) {
                if (result[v] != -1)
                    available[result[v]] = false;
            }

            // Find the first available color
            int cr;
            for (cr = 0; cr < V; cr++) {
                if (available[cr])
                    break;
            }

            // Assign the found color to the vertex
            result[u] = cr;
        }

        // Print the result
        for (int u = 0; u < V; u++) {
            System.out.println("Vertex " + u + " --> Color " + result[u]);
        }
    }

    public static void main(String[] args) {
        GraphColoring g = new GraphColoring(5);
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

