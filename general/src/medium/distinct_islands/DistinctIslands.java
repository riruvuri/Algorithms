package medium.distinct_islands;

import java.util.*;

public class DistinctIslands {
    public int numDistinctIslands(int[][] grid) {
        Set<Set<List<Integer>>> uniqueIslands = new HashSet<>();
        for (int i=0; i < grid.length; i++) {
            for (int j=0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    Set<List<Integer>> uniqueGrid = new HashSet<>();
                    findUniqueIsland(grid, i, j, uniqueGrid);

                    if (!uniqueGrid.isEmpty()) {
                        uniqueIslands.add(uniqueGrid);
                    }
                }
            }
        }
        return uniqueIslands.size();
    }

    private void findUniqueIsland(int[][] grid, int i, int j, Set<List<Integer>> uniqueGrid) {
        Queue<List<Integer>> queue = new LinkedList();
        queue.add(Arrays.asList(i, j));

        while (!queue.isEmpty()) {
            List<Integer> indexList = queue.poll();
            uniqueGrid.add(Arrays.asList(indexList.get(0) - i, indexList.get(1) - j));
            grid[indexList.get(0)][indexList.get(1)]=0;

            List<List<Integer>> neighbors = findNeighbors(grid, indexList.get(0), indexList.get(1));

            for (List<Integer> neighbor : neighbors) {
                queue.add(neighbor);
            }
        }
    }

    private List<List<Integer>> findNeighbors(int[][] grid, int i, int j) {
        List<List<Integer>> neighbors = new ArrayList<>();

        if (i+1 < grid.length && grid[i+1][j] == 1) {
            neighbors.add(Arrays.asList(i+1, j));
        }

        if (i-1 >= 0 && grid[i-1][j] == 1) {
            neighbors.add(Arrays.asList(i-1, j));
        }

        if (j-1 >= 0 && grid[i][j-1] == 1) {
            neighbors.add(Arrays.asList(i, j-1));
        }

        if (j+1 < grid[i].length && grid[i][j+1] == 1) {
            neighbors.add(Arrays.asList(i, j+1));
        }
        return neighbors;
    }
}
