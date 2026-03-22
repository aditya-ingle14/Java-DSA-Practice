// Solve the N-Queens problem.

// Given an integer n, return all distinct solutions to placing n queens on an n × n chessboard such that no two queens attack each other.

// Each solution should represent the board configuration using:
// - 'Q' for a queen
// - '.' for an empty space





import java.util.*;

class prog89 {

    public void helper(char[][] board, List<List<String>> allBoards, int col) {

        if (col == board.length) {
            saveBoard(board, allBoards);
            return;
        }

        for (int row = 0; row < board.length; row++) {

            if (isSafe(row, col, board)) {
                board[row][col] = 'Q';

                helper(board, allBoards, col + 1);

                board[row][col] = '.';
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> allBoards = new ArrayList<>();

        char[][] board = new char[n][n];

        // initialize board with '.'
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        helper(board, allBoards, 0);
        return allBoards;
    }

    public boolean isSafe(int row, int col, char[][] board) {

        // horizontal left
        for (int j = 0; j < col; j++) {
            if (board[row][j] == 'Q') {
                return false;
            }
        }

        // upper left diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // lower left diagonal
        for (int i = row, j = col; i < board.length && j >= 0; i++, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    public void saveBoard(char[][] board, List<List<String>> allBoards) {
        List<String> newBoard = new ArrayList<>();

        for (int i = 0; i < board.length; i++) {
            String row = "";
            for (int j = 0; j < board.length; j++) {
                row += board[i][j];
            }
            newBoard.add(row);
        }

        allBoards.add(newBoard);
    }
}