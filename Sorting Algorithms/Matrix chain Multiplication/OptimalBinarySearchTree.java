public class OptimalBinarySearchTree {

    public static double optimalBST(double[] keys, double[] freq) {
        int n = keys.length;
        double[][] cost = new double[n + 1][n + 1];

        for (int i = 0; i < n; i++) {
            cost[i][i] = freq[i];
        }

        for (int length = 2; length <= n; length++) {
            for (int i = 0; i <= n - length + 1; i++) {
                int j = i + length - 1;
                cost[i][j] = Double.MAX_VALUE;

                double sum = getSum(freq, i, j);
                for (int k = i; k <= j; k++) {
                    double val = sum + (k > i ? cost[i][k - 1] : 0) + (k < j ? cost[k + 1][j] : 0);
                    if (val < cost[i][j]) {
                        cost[i][j] = val;
                    }
                }
            }
        }

        return cost[0][n - 1];
    }

    private static double getSum(double[] freq, int i, int j) {
        double sum = 0;
        for (int k = i; k <= j; k++) {
            sum += freq[k];
        }
        return sum;
    }

    public static void main(String[] args) {
        double[] keys = {10, 12, 20};
        double[] freq = {34, 8, 50};

        double minCost = optimalBST(keys, freq);
        System.out.println("Minimum cost of optimal BST: " + minCost);
    }
}

