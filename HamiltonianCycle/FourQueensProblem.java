public class FourQueensProblem {
    private static final int N = 4;

    // Function to print the board configuration
    private static void printBoard(int[][] board) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Function to solve the 4 Queens Problem
    private static boolean solveNQueens(int[][] board, int col) {
        // Base case: If all queens are placed, return true
        if (col >= N)
            return true;

        // Try placing this queen in all rows one by one
        for (int i = 0; i < N; i++) {
            // Check if the queen can be placed on board[i][col]
            if (isSafe(board, i, col)) {
                // Place this queen in board[i][col]
                board[i][col] = 1;

                // Recur to place rest of the queens
                if (solveNQueens(board, col + 1))
                    return true;

                // If placing queen in board[i][col] doesn't lead to a solution then remove the queen from board[i][col]
                board[i][col] = 0; // BACKTRACK
            }
        }

        // If the queen can't be placed in any row in this column col, then return false
        return false;
    }

    // Function to check if a queen can be placed at the specified position
    private static boolean isSafe(int[][] board, int row, int col) {
        // Check if there's a queen in the same row
        for (int i = 0; i < col; i++)
            if (board[row][i] == 1)
                return false;

        // Check upper left diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 1)
                return false;

        // Check lower left diagonal
        for (int i = row, j = col; j >= 0 && i < N; i++, j--)
            if (board[i][j] == 1)
                return false;

        return true;
    }

    public static void main(String[] args) {
        int[][] board = new int[N][N];

        if (!solveNQueens(board, 0)) {
            System.out.println("Solution does not exist");
            return;
        }

        System.out.println("Board Configuration:");
        printBoard(board);
    }
}

