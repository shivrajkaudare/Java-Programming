import java.util.*;

class Item {
    int weight;
    int value;
    double cost;

    public Item(int weight, int value) {
        this.weight = weight;
        this.value = value;
        this.cost = (double)value / weight;
    }
}

class Node {
    int level;
    int profit;
    int weight;
    double bound;

    public Node(int level, int profit, int weight, double bound) {
        this.level = level;
        this.profit = profit;
        this.weight = weight;
        this.bound = bound;
    }
}

public class KnapsackLCBB {

    public static double bound(Node u, int n, int W, Item[] arr) {
        if (u.weight >= W)
            return 0;

        double profitBound = u.profit;
        int j = u.level + 1;
        int totalWeight = u.weight;

        while ((j < n) && (totalWeight + arr[j].weight <= W)) {
            totalWeight += arr[j].weight;
            profitBound += arr[j].value;
            j++;
        }

        if (j < n)
            profitBound += (W - totalWeight) * arr[j].cost;

        return profitBound;
    }

    public static int knapsackLCBB(int W, Item[] arr, int n) {
        Arrays.sort(arr, (a, b) -> Double.compare(b.cost, a.cost));

        PriorityQueue<Node> pq = new PriorityQueue<>(Comparator.comparingDouble(u -> -u.bound));

        Node u = new Node(-1, 0, 0, 0);
        pq.add(u);

        int maxProfit = 0;

        while (!pq.isEmpty()) {
            u = pq.poll();

            if (u.level == -1)
                maxProfit = Math.max(maxProfit, u.profit);

            if (u.level == n - 1)
                continue;

            Node v = new Node(u.level + 1,
                    u.profit + arr[u.level + 1].value,
                    u.weight + arr[u.level + 1].weight,
                    bound(u, n, W, arr));

            if (v.weight <= W && v.profit > maxProfit)
                maxProfit = v.profit;

            if (v.bound > maxProfit)
                pq.add(v);

            v = new Node(u.level + 1, u.profit, u.weight, bound(u, n, W, arr));

            if (v.bound > maxProfit)
                pq.add(v);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] values = {60, 100, 120};
        int[] weights = {10, 20, 30};
        int W = 50;
        int n = values.length;

        Item[] arr = new Item[n];
        for (int i = 0; i < n; i++) {
            arr[i] = new Item(weights[i], values[i]);
        }

        int maxProfit = knapsackLCBB(W, arr, n);
        System.out.println("Maximum profit: " + maxProfit);
    }
}

