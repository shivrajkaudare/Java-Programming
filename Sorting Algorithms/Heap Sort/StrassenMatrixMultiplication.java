public class StrassenMatrixMultiplication {

    public static int[][] strassenMultiply(int[][] A, int[][] B) {
        int n = A.length;
        int[][] C = new int[n][n];

        // Base case: If the matrices are 1x1
        if (n == 1) {
            C[0][0] = A[0][0] * B[0][0];
        } else {
            // Splitting matrices into submatrices
            int[][] A11 = new int[n / 2][n / 2];
            int[][] A12 = new int[n / 2][n / 2];
            int[][] A21 = new int[n / 2][n / 2];
            int[][] A22 = new int[n / 2][n / 2];
            int[][] B11 = new int[n / 2][n / 2];
            int[][] B12 = new int[n / 2][n / 2];
            int[][] B21 = new int[n / 2][n / 2];
            int[][] B22 = new int[n / 2][n / 2];

            splitMatrix(A, A11, 0, 0);
            splitMatrix(A, A12, 0, n / 2);
            splitMatrix(A, A21, n / 2, 0);
            splitMatrix(A, A22, n / 2, n / 2);
            splitMatrix(B, B11, 0, 0);
            splitMatrix(B, B12, 0, n / 2);
            splitMatrix(B, B21, n / 2, 0);
            splitMatrix(B, B22, n / 2, n / 2);

            // Strassen's recursive steps
            int[][] M1 = strassenMultiply(addMatrices(A11, A22), addMatrices(B11, B22));
            int[][] M2 = strassenMultiply(addMatrices(A21, A22), B11);
            int[][] M3 = strassenMultiply(A11, subtractMatrices(B12, B22));
            int[][] M4 = strassenMultiply(A22, subtractMatrices(B21, B11));
            int[][] M5 = strassenMultiply(addMatrices(A11, A12), B22);
            int[][] M6 = strassenMultiply(subtractMatrices(A21, A11), addMatrices(B11, B12));
            int[][] M7 = strassenMultiply(subtractMatrices(A12, A22), addMatrices(B21, B22));

            // Calculate result submatrices
            int[][] C11 = addMatrices(subtractMatrices(addMatrices(M1, M4), M5), M7);
            int[][] C12 = addMatrices(M3, M5);
            int[][] C21 = addMatrices(M2, M4);
            int[][] C22 = addMatrices(subtractMatrices(subtractMatrices(M1, M2), M3), M6);

            // Combine result submatrices into the final matrix
            joinMatrices(C11, C, 0, 0);
            joinMatrices(C12, C, 0, n / 2);
            joinMatrices(C21, C, n / 2, 0);
            joinMatrices(C22, C, n / 2, n / 2);
        }
        return C;
    }

    public static void splitMatrix(int[][] parent, int[][] child, int startRow, int startCol) {
        for (int i1 = 0, i2 = startRow; i1 < child.length; i1++, i2++) {
            for (int j1 = 0, j2 = startCol; j1 < child.length; j1++, j2++) {
                child[i1][j1] = parent[i2][j2];
            }
        }
    }

    public static void joinMatrices(int[][] child, int[][] parent, int startRow, int startCol) {
        for (int i1 = 0, i2 = startRow; i1 < child.length; i1++, i2++) {
            for (int j1 = 0, j2 = startCol; j1 < child.length; j1++, j2++) {
                parent[i2][j2] = child[i1][j1];
            }
        }
    }

    public static int[][] addMatrices(int[][] A, int[][] B) {
        int n = A.length;
        int[][] C = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        return C;
    }

    public static int[][] subtractMatrices(int[][] A, int[][] B) {
        int n = A.length;
        int[][] C = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                C[i][j] = A[i][j] - B[i][j];
            }
        }
        return C;
    }

    public static void printMatrix(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] A = {
                {1, 2},
                {3, 4}
        };

        int[][] B = {
                {5, 6},
                {7, 8}
        };

        int[][] result = strassenMultiply(A, B);

        System.out.println("Matrix A:");
        printMatrix(A);
        System.out.println("Matrix B:");
        printMatrix(B);
        System.out.println("Result of Strassen's Matrix Multiplication:");
        printMatrix(result);
    }
}

