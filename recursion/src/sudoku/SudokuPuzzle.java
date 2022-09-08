package sudoku;

/**
 * Time complexity: O(9 ^ k), k is the number of unfilled cells
 * For each unfilled cells, we try 9 digits.
 *
 * Space complexity: O(n ^ 2)
 */
public class SudokuPuzzle {

    public int[][] solveSudokuPuzzle(int [][] input) {
        solveBoard(input);
        return input;
    }

    private boolean solveBoard(int[][] input) {
        for (int row=0; row < input.length;row++) {
            for (int col=0; col< input[0].length; col++) {
                // Find a cell to fill
                if (input[row][col] == 0) {
                    for (int k=1; k <= 9; k++) {
                        // check Row, column and grid
                        if (isValidRow(input, row, k)
                                && isValidColumn(input, col, k)
                                && isValidGrid(input, row, col, k)) {
                            input[row][col] = k;

                            if (solveBoard(input)) {
                                return true;
                            }

                            input[row][col] = 0;
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isValidRow(int[][] input, int row, int newValue) {
        int [] rowValues = input[row];
        for (int existing : rowValues) {
            if (existing == newValue) {
                return false;
            }
        }
        return true;
    }

    private boolean isValidColumn(int[][] input, int column, int newValue) {
        for (int row=0; row < input.length; row++) {
            if (input[row][column] == newValue) {
                return false;
            }
        }
        return true;
    }

    private boolean isValidGrid(int[][] input, int row, int column, int value) {
        int startRow = (row/3)*3;
        int startCol = (column/3)*3;
        for (int i=startRow; i < startRow+3; i++) {
            for (int j=startCol; j < startCol+3; j++) {
                if (input[i][j] == value) {
                    return false;
                }
            }
        }
        return true;
    }
}

