import java.util.*;

public class TravelingSalesmanNearestNeighbor {

    public static List<Integer> nearestNeighbor(int[][] graph) {
        int n = graph.length;
        boolean[] visited = new boolean[n];
        List<Integer> path = new ArrayList<>();
        
        // Start from the first city
        int current = 0;
        path.add(current);
        visited[current] = true;

        for (int i = 0; i < n - 1; i++) {
            int next = findNearestNeighbor(graph, current, visited);
            path.add(next);
            visited[next] = true;
            current = next;
        }

        // Return to the starting city
        path.add(0);

        return path;
    }

    private static int findNearestNeighbor(int[][] graph, int current, boolean[] visited) {
        int n = graph.length;
        int nearestNeighbor = -1;
        int shortestDistance = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (!visited[i] && graph[current][i] < shortestDistance) {
                nearestNeighbor = i;
                shortestDistance = graph[current][i];
            }
        }

        return nearestNeighbor;
    }

    public static void main(String[] args) {
        int[][] graph = {
            {0, 29, 20, 21},
            {29, 0, 15, 22},
            {20, 15, 0, 18},
            {21, 22, 18, 0}
        };

        List<Integer> path = nearestNeighbor(graph);
        System.out.println("Path using Nearest Neighbor algorithm: " + path);
    }
}

