package hard.shortest_path_obstacle_elimination;

import java.util.*;

public class ShortestPath {
    public int shortestPath(int[][] grid, int k) {
        int[] target = {grid.length-1, grid[0].length-1};

        // Shortest distance in a grid is the Manhattan distance
        // Manhattan distance = |x1 - x2| + |y1 - y2|
        if (k >= target[0] + target[1]) {
            return target[0] + target[1];
        }

        int shortestPath = findShortestPathBFS(grid, k, target);

        return shortestPath;
    }

    private int findShortestPathBFS(int[][] grid, int k, int[] target) {
        // Move from grid at [0,0] to [row-1, col-1]
        Path startPath = new Path(0, 0, k, 0);
        Queue<Path> queue = new PriorityQueue<>(Comparator.comparing(Path::getOptionsAvailable).reversed());
        queue.add(startPath);
        Set<Path> visited = new HashSet<>();
        int shortestPath = Integer.MAX_VALUE;

        while (!queue.isEmpty()) {
            Path currentPath = queue.poll();
            visited.add(currentPath);

            if (currentPath.row == target[0] && currentPath.col == target[1]) {
                return Math.min(shortestPath, currentPath.steps);
            }

            List<int[]> neighbors = findNeighbors(currentPath, grid);

            for (int[] neighbor : neighbors) {
                if (currentPath.k - grid[neighbor[0]][neighbor[1]] >= 0) {
                    Path newPath = new Path(neighbor[0], neighbor[1], currentPath.k - grid[neighbor[0]][neighbor[1]], currentPath.steps + 1);

                    if (!visited.contains(newPath)) {
                        queue.add(newPath);
                    }
                }
            }
        }

        return shortestPath == Integer.MAX_VALUE ? -1 : shortestPath;
    }

    private List<int[]> findNeighbors(Path currentPath, int[][] grid) {
        int[][] directions = {{-1,0}, {1,0}, {0,-1}, {0,1}};
        List<int[]> neighbors = new ArrayList<int[]>();
        for (int[] direction : directions) {
            int row = currentPath.row + direction[0];
            int col = currentPath.col + direction[1];

            if (row < 0 || col < 0
                    || row > grid.length - 1 || col > grid[0].length - 1
                    || currentPath.k < grid[row][col]) {
                continue;
            }

            neighbors.add(new int[]{row, col});
        }

        return neighbors;
    }
}
class Path {
    int row;
    int col;
    int k;
    int steps;

    public int getOptionsAvailable() {
        return k;
    }

    Path(int row, int col, int k, int steps) {
        this.row = row;
        this.col = col;
        this.k = k;
        this.steps=steps;
    }

    @Override
    public int hashCode() {
        return (this.row + 1) * (this.col + 1);
    }

    @Override
    public boolean equals(Object obj) {
        Path p = (Path) obj;
        return this.row == p.row && this.col==p.col;
    }
}