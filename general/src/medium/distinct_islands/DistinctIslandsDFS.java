package medium.distinct_islands;

import java.util.*;

public class DistinctIslandsDFS {
    int currentRow = -1;
    int currentColumn = -1;
    public int numDistinctIslands(int[][] grid) {
        Set<Set<List<Integer>>> uniqueIslands = new HashSet<>();
        for (int i=0; i < grid.length; i++) {
            for (int j=0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    currentRow = i;
                    currentColumn = j;
                    Set<List<Integer>> uniqueGrid = new HashSet<>();
                    findUniqueIslandDFS(grid, i, j, uniqueGrid);

                    if (!uniqueGrid.isEmpty()) {
                        uniqueIslands.add(uniqueGrid);
                    }
                }
            }
        }
        return uniqueIslands.size();
    }

    private void findUniqueIslandDFS(int[][] grid, int i, int j, Set<List<Integer>> uniqueGrid) {
        // base case
        if (i < 0 || j < 0 || i > grid.length - 1 || j > grid[i].length - 1 || grid[i][j] != 1) {
            return;
        }

        uniqueGrid.add(Arrays.asList(i - currentRow, j - currentColumn));
        grid[i][j] = 0;

        findUniqueIslandDFS(grid, i+1, j, uniqueGrid);
        findUniqueIslandDFS(grid, i-1, j, uniqueGrid);
        findUniqueIslandDFS(grid, i, j-1, uniqueGrid);
        findUniqueIslandDFS(grid, i, j+1, uniqueGrid);
    }
}
