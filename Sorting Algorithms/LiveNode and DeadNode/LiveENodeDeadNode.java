import java.util.*;

public class LiveENodeDeadNode {
    private int V; // Number of vertices
    private LinkedList<Integer>[] adj; // Adjacency list representation

    public LiveENodeDeadNode(int v) {
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

    // Depth First Search (DFS) to traverse the graph and mark visited nodes
    private void dfs(int v, boolean[] visited) {
        visited[v] = true;
        for (int u : adj[v]) {
            if (!visited[u]) {
                dfs(u, visited);
            }
        }
    }

    // Function to find live nodes, E-nodes, and dead nodes
    public void findLiveENodeDeadNode() {
        // Mark all vertices as not visited
        boolean[] visited = new boolean[V];
        Arrays.fill(visited, false);

        // Perform DFS starting from the first vertex
        dfs(0, visited);

        // Count the number of live nodes, E-nodes, and dead nodes
        int liveNodes = 0;
        int eNodes = 0;
        int deadNodes = 0;
        for (int i = 0; i < V; i++) {
            if (visited[i])
                liveNodes++;
            else
                deadNodes++;
        }

        // Check if there are any E-nodes
        for (int i = 1; i < V; i++) {
            boolean[] tempVisited = new boolean[V];
            Arrays.fill(tempVisited, false);
            tempVisited[i] = true;
            dfs(0, tempVisited);
            boolean isConnected = true;
            for (int j = 0; j < V; j++) {
                if (!tempVisited[j]) {
                    isConnected = false;
                    break;
                }
            }
            if (!isConnected)
                eNodes++;
        }

        System.out.println("Live Nodes: " + liveNodes);
        System.out.println("E-Nodes: " + eNodes);
        System.out.println("Dead Nodes: " + deadNodes);
    }

    public static void main(String[] args) {
        LiveENodeDeadNode g = new LiveENodeDeadNode(6);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 3);
        g.addEdge(3, 4);

        System.out.println("Live, E-node, and Dead Node analysis:");
        g.findLiveENodeDeadNode();
    }
}

