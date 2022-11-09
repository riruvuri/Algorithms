package medium17.rotting_oranges;

import java.util.*;

/**
 * LC: 994
 *
 * https://leetcode.com/problems/rotting-oranges/solutions/583522/rotting-oranges/
 *
 * Time complexity: O(NM)
 * Space complexity: O(NM)
 */
public class RottingOranges {
    public int orangesRotting(int[][] grid) {
        int totalMins = 0;
        for (int i=0; i < grid.length; i++) {
            for (int j=0; j < grid.length; j++) {
                if (grid[i][j] == 2) {
                    totalMins += countHelper(i, j, grid);
                }
            }
        }
        return totalMins;
    }

    private int countHelper(int i, int j, int[][] grid) {

        int counter = -1;
        Queue<List<Integer>> queue = new LinkedList<>();
        queue.add(Arrays.asList(i, j));

        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size-- > 0) {
                List<Integer> currentGrid = queue.poll();
                grid[currentGrid.get(0)][currentGrid.get(1)] = -1;

                // Find neighbors
                List<List<Integer>> neighbors = findNeighbors(currentGrid.get(0),currentGrid.get(1), grid);
                for (List<Integer> neighbor : neighbors) {
                    queue.add(neighbor);
                }
            }
            counter++;
        }
        return counter;
    }

    private List<List<Integer>> findNeighbors(int i, int j, int[][] grid) {
        List<List<Integer>> neighbors = new ArrayList<>();
        if (i+1 < grid.length && grid[i+1][j] == 1) {
            neighbors.add(Arrays.asList(i+1,j));
        }
        if (j+1 < grid[i].length && grid[i][j+1] == 1) {
            neighbors.add(Arrays.asList(i,j+1));
        }

        if (i-1 >= 0 && grid[i-1][j] == 1) {
            neighbors.add(Arrays.asList(i-1,j));
        }
        if (j-1 >= 0 && grid[i][j-1] == 1) {
            neighbors.add(Arrays.asList(i,j-1));
        }

        return neighbors;
    }
}
