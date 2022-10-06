package easy9.flood_fill;

import java.util.*;

public class FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        Queue<List<Integer>> queue = new LinkedList<>();
        queue.add(Arrays.asList(sr, sc));

        while (!queue.isEmpty()) {
            List<Integer> srcList = queue.poll();
            List<List<Integer>> neighbors = getNeighbors(image, srcList.get(0), srcList.get(1));
            image[srcList.get(0)][srcList.get(1)] = color;

            if (neighbors.size() > 0) {
                queue.addAll(neighbors);
            }
        }
        return image;
    }

    private List<List<Integer>> getNeighbors(int [][] image, int sr, int sc) {
        List<List<Integer>> neighbors = new ArrayList<>();
        int currentVal = image[sr][sc];
        if (sr-1 >= 0 && image[sr-1][sc] == currentVal) {
            neighbors.add(Arrays.asList(sr-1, sc));
        }

        if (sr+1 < image.length && image[sr+1][sc] == currentVal) {
            neighbors.add(Arrays.asList(sr+1, sc));
        }

        if (sc-1 >= 0  && image[sr][sc-1] == currentVal) {
            neighbors.add(Arrays.asList(sr, sc-1));
        }

        if (sc+1 < image[0].length  && image[sr][sc+1] == currentVal) {
            neighbors.add(Arrays.asList(sr, sc+1));
        }

        return neighbors;
    }
}
