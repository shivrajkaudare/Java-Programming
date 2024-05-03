import java.util.*;

public class PrimMST {

    private static final int INF = Integer.MAX_VALUE;

    public static int primMST(int[][] graph) {
        int V = graph.length;
        int[] key = new int[V];
        Arrays.fill(key, INF);
        boolean[] mstSet = new boolean[V];

        key[0] = 0; // Start with the first vertex

        for (int count = 0; count < V - 1; count++) {
            int u = minKey(key, mstSet);
            mstSet[u] = true;

            for (int v = 0; v < V; v++) {
                if (graph[u][v] != 0 && !mstSet[v] && graph[u][v] < key[v]) {
                    key[v] = graph[u][v];
                }
            }
        }

        // Calculate the total weight of the MST
        int minCost = 0;
        for (int i = 0; i < V; i++) {
            minCost += key[i];
        }

        return minCost;
    }

    public static int minKey(int[] key, boolean[] mstSet) {
        int min = INF, minIndex = -1;
        for (int v = 0; v < key.length; v++) {
            if (!mstSet[v] && key[v] < min) {
                min = key[v];
                minIndex = v;
            }
        }
        return minIndex;
    }

    public static void main(String[] args) {
        int[][] graph = {
                {0, 2, 0, 6, 0},
                {2, 0, 3, 8, 5},
                {0, 3, 0, 0, 7},
                {6, 8, 0, 0, 9},
                {0, 5, 7, 9, 0}
        };

        int minCost = primMST(graph);
        System.out.println("Minimum Cost Spanning Tree weight: " + minCost);
    }
}

