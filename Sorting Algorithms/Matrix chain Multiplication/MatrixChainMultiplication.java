public class MatrixChainMultiplication {

    public static int matrixChainOrder(int[] p) {
        int n = p.length - 1;
        int[][] m = new int[n][n];

        // cost is zero when multiplying one matrix.
        for (int i = 1; i < n; i++) {
            m[i][i] = 0;
        }

        // L is chain length.
        for (int L = 2; L < n; L++) {
            for (int i = 1; i <= n - L + 1; i++) {
                int j = i + L - 1;
                m[i][j] = Integer.MAX_VALUE;
                for (int k = i; k <= j - 1; k++) {
                    int q = m[i][k] + m[k + 1][j] + p[i - 1] * p[k] * p[j];
                    if (q < m[i][j]) {
                        m[i][j] = q;
                    }
                }
            }
        }
        return m[1][n - 1];
    }

    public static void main(String[] args) {
        int[] p = {10, 20, 30, 40, 30};
        int minMultiplications = matrixChainOrder(p);
        System.out.println("Minimum number of multiplications: " + minMultiplications);
    }
}

