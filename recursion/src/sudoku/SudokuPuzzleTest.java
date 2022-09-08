package sudoku;

import org.junit.Assert;
import org.junit.Test;

public class SudokuPuzzleTest {

    @Test
    public void test_sample() {
        int[][] input = {{8, 4, 9, 0, 0, 3, 5, 7, 0},
                        {0, 1, 0, 0, 0, 0, 0, 0, 0},
                        {7, 0, 0, 0, 9, 0, 0, 8, 3},
                        {0, 0, 0, 9, 4, 6, 7, 0, 0},
                        {0, 8, 0, 0, 5, 0, 0, 4, 0},
                        {0, 0, 6, 8, 7, 2, 0, 0, 0},
                        {5, 7, 0, 0, 1, 0, 0, 0, 4},
                        {0, 0, 0, 0, 0, 0, 0, 1, 0},
                        {0, 2, 1, 7, 0, 0, 8, 6, 5}};

        int[][] expected = {
                {8, 4, 9, 1, 6, 3, 5, 7, 2},
                {3, 1, 5, 2, 8, 7, 4, 9, 6},
                {7, 6, 2, 4, 9, 5, 1, 8, 3},
                {1, 5, 3, 9, 4, 6, 7, 2, 8},
                {2, 8, 7, 3, 5, 1, 6, 4, 9},
                {4, 9, 6, 8, 7, 2, 3, 5, 1},
                {5, 7, 8, 6, 1, 9, 2, 3, 4},
                {6, 3, 4, 5, 2, 8, 9, 1, 7},
                {9, 2, 1, 7, 3, 4, 8, 6, 5}};

        SudokuPuzzle sudokuPuzzle = new SudokuPuzzle();
        int[][] result = sudokuPuzzle.solveSudokuPuzzle(input);
        Assert.assertArrayEquals(expected, result);

    }
}
