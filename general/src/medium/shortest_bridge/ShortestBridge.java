package medium.shortest_bridge;

import java.util.*;

/**
 * https://leetcode.com/problems/shortest-bridge/solutions/1448914/java-easy-approach-with-explanation-bfs-dfs-preorder-graph/
 */
public class ShortestBridge {
    private final int[][] directions = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
    public int shortestBridge(int[][] grid) {

        // Find the first connected component
        boolean isFirstIslandFound = false;
        Queue<List<Integer>> connectedCells = new LinkedList<>();
        Set<List<Integer>> uniqueSet = new HashSet<>();
        for (int i=0; i < grid.length && !isFirstIslandFound; i++) {
            for (int j=0; j < grid[i].length && !isFirstIslandFound; j++) {
                if (grid[i][j] == 1) {
                    findAllConnectedCells(grid, i, j, connectedCells);
                    isFirstIslandFound = true;
                }
            }
        }

        return findTrippedCellCount(grid, connectedCells);
    }

    private void findAllConnectedCells(int[][] grid, int i, int j, Queue<List<Integer>> connectedCells) {
        if (i < 0 || j < 0
                || i > grid.length - 1 || j > grid[i].length - 1
                || grid[i][j] == 0 || grid[i][j] == -1) {
            return;
        }

        connectedCells.add(Arrays.asList(i, j));
        grid[i][j] = -1;

        for (int[] direction : directions) {
            findAllConnectedCells(grid, i+direction[0], j+direction[1], connectedCells);
        }
        /*
        findAllConnectedCells(grid, i-1, j, connectedCells);
        findAllConnectedCells(grid, i, j+1, connectedCells);
        findAllConnectedCells(grid, i+1, j, connectedCells);
        findAllConnectedCells(grid, i, j-1, connectedCells);
         */
    }
    private int findTrippedCellCount(int[][] grid, Queue<List<Integer>> connectedCells) {
        int level = 0;
        while (!connectedCells.isEmpty()) {
            int size = connectedCells.size();
            while (size-- > 0){
                List<Integer> connectedCell = connectedCells.poll();

                for (int[] direction : directions) {
                    int currentRow = connectedCell.get(0) + direction[0];
                    int currentCol = connectedCell.get(1) + direction[1];

                    // Check overflow
                    if (currentRow < 0 || currentCol < 0
                            || currentRow > grid.length - 1
                            || currentCol > grid[currentRow].length - 1
                            || grid[currentRow][currentCol] == -1) {
                        continue;
                    }

                    if (grid[currentRow][currentCol] == 1) {
                        return level;
                    } else {
                        grid[currentRow][currentCol] = -1;
                        connectedCells.add(Arrays.asList(currentRow, currentCol));
                    }
                }
            }
            level+=1;
        }
        return -1;
    }

}
