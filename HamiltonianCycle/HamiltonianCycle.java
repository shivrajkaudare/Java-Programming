import java.util.*;

public class HamiltonianCycle {
    private int V;
    private int[][] graph;

    public HamiltonianCycle(int v) {
        V = v;
        graph = new int[V][V];
    }

    public void addEdge(int u, int v) {
        graph[u][v] = 1;
        graph[v][u] = 1;
    }

    public boolean isSafe(int v, int[] path, int pos) {
        if (graph[path[pos - 1]][v] == 0)
            return false;

        for (int i = 0; i < pos; i++)
            if (path[i] == v)
                return false;

        return true;
    }

    public boolean hamiltonianCycleUtil(int[] path, int pos) {
        if (pos == V) {
            if (graph[path[pos - 1]][path[0]] == 1)
                return true;
            else
                return false;
        }

        for (int v = 1; v < V; v++) {
            if (isSafe(v, path, pos)) {
                path[pos] = v;

                if (hamiltonianCycleUtil(path, pos + 1))
                    return true;

                path[pos] = -1;
            }
        }

        return false;
    }

    public boolean hamiltonianCycle() {
        int[] path = new int[V];
        Arrays.fill(path, -1);
        path[0] = 0;

        if (!hamiltonianCycleUtil(path, 1)) {
            System.out.println("No Hamiltonian cycle exists");
            return false;
        }

        System.out.println("Hamiltonian cycle exists:");
        for (int i = 0; i < V; i++)
            System.out.print(path[i] + " ");

        System.out.println(path[0]);

        return true;
    }

    public static void main(String[] args) {
        HamiltonianCycle graph = new HamiltonianCycle(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 3);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 4);
        graph.addEdge(3, 4);

        graph.hamiltonianCycle();
    }
}

