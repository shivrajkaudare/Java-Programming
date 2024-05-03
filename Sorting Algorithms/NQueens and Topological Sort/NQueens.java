public class NQueens {
    private static final int N = 8; // Change N for different board sizes

    // Function to check if a queen can be placed at the specified position
    private static boolean isSafe(int[][] board, int row, int col) {
        int i, j;

        // Check this row on left side
        for (i = 0; i < col; i++)
            if (board[row][i] == 1)
                return false;

        // Check upper diagonal on left side
        for (i = row, j = col; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 1)
                return false;

        // Check lower diagonal on left side
        for (i = row, j = col; j >= 0 && i < N; i++, j--)
            if (board[i][j] == 1)
                return false;

        return true;
    }

    // Recursive function to solve N Queens problem
    private static boolean solveNQueensUtil(int[][] board, int col) {
        // If all queens are placed, return true
        if (col >= N)
            return true;

        // Try placing this queen in all rows one by one
        for (int i = 0; i < N; i++) {
            // Check if the queen can be placed on board[i][col]
            if (isSafe(board, i, col)) {
                // Place this queen in board[i][col]
                board[i][col] = 1;

                // Recur to place rest of the queens
                if (solveNQueensUtil(board, col + 1))
                    return true;

                // If placing queen in board[i][col] doesn't lead to a solution then remove the queen from board[i][col]
                board[i][col] = 0; // BACKTRACK
            }
        }

        // If the queen can't be placed in any row in this column col, then return false
        return false;
    }

    // Wrapper function to solve N Queens problem
    public static void solveNQueens() {
        int[][] board = new int[N][N];

        if (!solveNQueensUtil(board, 0)) {
            System.out.println("Solution does not exist");
            return;
        }

        // Print the solution
        System.out.println("Solution:");
        for (int[] row : board) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

    // Main method
    public static void main(String[] args) {
        solveNQueens();
    }
}

