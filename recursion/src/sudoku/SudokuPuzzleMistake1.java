package sudoku;

import java.util.*;

public class SudokuPuzzleMistake1 {


    static ArrayList<ArrayList<Integer>> solve_sudoku_puzzle(ArrayList<ArrayList<Integer>> board) {

        solveBoard(board);

        return board;
    }

    static boolean solveBoard(ArrayList<ArrayList<Integer>> board) {
        for (int i=0; i < board.size(); i++) {
            ArrayList<Integer> currentRow = board.get(i);
            for (int j=0; j < currentRow.size(); j++) {

                // Check for empty cell
                if (currentRow.get(j) == 0) {
                    // This slot can be filled by any integer
                    for (int k=1; k <= currentRow.size(); k++) {
                        // Update the value and verify whether it fulfills all criteria

                        if (!checkIfRowHasMatch(currentRow, k)
                                && !checkIfColumnHasMatch(board, j, k)
                                && !checkIfGridHasMatch(board, i, j, k)) {
                            currentRow.set(j, k);

                            /*
                            if (solveBoard(board)) {
                                return true;
                            }
                            */
                        }

                        if (solveBoard(board)) {
                            return true;
                        }


                        currentRow.set(j, 0);
                    }

                    return false;
                }
            }
        }
        return true;
    }

    static boolean checkIfRowHasMatch(ArrayList<Integer> currentRow, int k) {
        for (int i =0; i < currentRow.size(); i++) {
            if (currentRow.get(i) == k) {
                return true;
            }
        }
        return false;
    }

    static boolean checkIfColumnHasMatch(ArrayList<ArrayList<Integer>> board, int column, int k) {
        for (int i=0; i < board.size(); i++) {
            ArrayList<Integer> currentRow = board.get(i);
            if (currentRow.get(column) == k) {
                return true;
            }
        }

        return false;
    }

    static boolean checkIfGridHasMatch(ArrayList<ArrayList<Integer>> board, int row, int column, int k) {
        int startRow = (row/3) * 3;
        int startCol = (column/3) * 3;
        for (int i=startRow; i < startRow + 3; i++) {
            ArrayList<Integer> currentRow = board.get(i);

            for (int j = startCol; j < startCol + 3; j++) {
                if (currentRow.get(j) == k) {
                    return true;
                }
            }
        }

        return false;
    }
}
