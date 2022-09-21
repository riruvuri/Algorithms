package graph.islands;

import java.util.*;

/**
 *
 * Time complexity of BFS or DFS is O(V + E), in our case it will be O(n * m + 8 * n * m) that is O(n * m).
 *
 * Space complexity:
 * DFS would make almost n * m nested recursive calls; that takes O(n * m) space.
 *
 * The worst-case for BFS is similar to that of DFS, where all entries of matrix are 1. Consider the
 * worst-case scenario, at some point of time all the nodes of the last row and last column will be in
 * the queue. The queue will then take O(n + m) = O(max(n, m)) space.
 */
public class MaxIslandArea {
    public Integer count(ArrayList<ArrayList<Integer>> matrix) {
        int maxArea = 0;

        for (int i=0; i < matrix.size(); i++) {
            for (int j=0; j < matrix.get(i).size(); j++) {
                int gridVal = matrix.get(i).get(j);
                if (gridVal == 1) {
                    int currentArea = bfs(matrix, i, j);
                    maxArea = Math.max(currentArea, maxArea);
                }
            }
        }

        return maxArea;
    }

    int bfs(ArrayList<ArrayList<Integer>> matrix, int row, int col) {
        int result = 1;
        markCellAsRead(matrix, row, col);

        Queue<List<Integer>> queue = new LinkedList<>();
        queue.offer(Arrays.asList(row, col));

        while (!queue.isEmpty()) {
            List<Integer> gridToVerify = queue.poll();

            List<List<Integer>> neighbors = getNeighbors(matrix, gridToVerify.get(0), gridToVerify.get(1));
            for (List<Integer> neighbor : neighbors) {
                int neighRow = neighbor.get(0);
                int neighCol = neighbor.get(1);
                if (matrix.get(neighRow).get(neighCol) == 1) {
                    result++;
                    queue.offer(neighbor);
                    markCellAsRead(matrix, neighRow, neighCol);
                }
            }
        }

        return result;
    }

    boolean markCellAsRead(ArrayList<ArrayList<Integer>> matrix, int row, int col) {
        ArrayList<Integer> colList = matrix.get(row);
        colList.set(col, 0);

        return true;
    }


    List<List<Integer>> getNeighbors(ArrayList<ArrayList<Integer>> matrix, int row, int col) {
        List<List<Integer>> neighbors = new ArrayList<>();
        // Visited rows and columns

        if (row - 1 >= 0) {
            neighbors.add(Arrays.asList(row-1, col));
        }

        if (col - 1 >= 0) {
            neighbors.add(Arrays.asList(row, col-1));
        }

        // Visited rows and columns
        if (row + 1 < matrix.size()) {
            neighbors.add(Arrays.asList(row + 1, col));
        }

        if (col + 1 < matrix.get(0).size()) {
            neighbors.add(Arrays.asList(row, col+1));
        }

        // Ignore diagonals
        /*
        // left up
        if (row - 1 >= 0 && col -1 >= 0) {
            neighbors.add(Arrays.asList(row-1, col-1));
        }

        // right up
        if (row - 1 >= 0 && col + 1 < matrix.get(0).size()) {
            neighbors.add(Arrays.asList(row-1, col + 1));
        }

        // bottom left
        if (row + 1 < matrix.size() && col -1 >= 0) {
            neighbors.add(Arrays.asList(row+1, col-1));
        }

        // bottom right
        if (row + 1 < matrix.size() && col + 1 < matrix.get(0).size()) {
            neighbors.add(Arrays.asList(row+1, col + 1));
        }*/

        return neighbors;
    }
}
