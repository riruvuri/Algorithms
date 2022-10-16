package medium16.no_of_islands;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountIslands {

    public int countIslands(char[][] grid) {
        int numOfIslands = 0;

        for (int i=0; i < grid.length; i++) {
            for (int j=0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    countHelper(i, j, grid);
                    numOfIslands++;
                }
            }
        }

        return numOfIslands;
    }

    private void countHelper(int i, int j, char[][] grid) {

        // Find neighbors
        List<List<Integer>> neighbors = findNeighbors(i,j, grid);
        for (List<Integer> neighbor : neighbors) {
            countHelper(neighbor.get(0), neighbor.get(1), grid);
        }

        grid[i][j] = '0';
    }

    private List<List<Integer>> findNeighbors(int i, int j, char[][] grid) {
        List<List<Integer>> neighbors = new ArrayList<>();
        if (i+1 < grid.length && grid[i+1][j] == grid[i][j]) {
            neighbors.add(Arrays.asList(i+1,j));
        }
        if (j+1 < grid[i].length && grid[i][j+1] == grid[i][j]) {
            neighbors.add(Arrays.asList(i,j+1));
        }
        return neighbors;
    }
}
