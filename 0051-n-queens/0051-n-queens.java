class Solution {

    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        List<List<String>> result = new ArrayList<>();
        solve(board, 0, n, result);

        return result;
    }

    void solve(char[][] board, int row, int n,
               List<List<String>> result) {

        if (row == n) {
            List<String> solution = new ArrayList<>();

            for (char[] r : board) {
                solution.add(new String(r));
            }

            result.add(solution);
            return;
        }

        for (int col = 0; col < n; col++) {
            if (isSafe(board, row, col, n)) {
                board[row][col] = 'Q';

                solve(board, row + 1, n, result);

                board[row][col] = '.'; // Backtrack
            }
        }
    }

    boolean isSafe(char[][] board, int row, int col, int n) {

        for (int i = 0; i < row; i++) {

            // Same column
            if (board[i][col] == 'Q') {
                return false;
            }

            // Upper-left diagonal
            int left = col - (row - i);
            if (left >= 0 && board[i][left] == 'Q') {
                return false;
            }

            // Upper-right diagonal
            int right = col + (row - i);
            if (right < n && board[i][right] == 'Q') {
                return false;
            }
        }

        return true;
    }
}