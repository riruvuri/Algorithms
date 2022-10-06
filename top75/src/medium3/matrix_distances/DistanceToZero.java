package medium3.matrix_distances;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DistanceToZero {
    public int[][] count(int[][] input) {
        Queue<List<Integer>> queue = new LinkedList<>();

        for (int i=0; i < input.length; i++) {
            for (int j=0; j < input[0].length; j++) {
                if (input[i][j] == 0) {
                    queue.add(Arrays.asList(i, j));
                } else {
                    input[i][j] = Integer.MAX_VALUE;
                }
            }
        }

        int[][] distances = {{1,0},{-1,0}, {0,1},{0,-1}};

        while (!queue.isEmpty()) {
            List<Integer> elementAtZero = queue.poll();
            int currentX = elementAtZero.get(0);
            int currentY = elementAtZero.get(1);

            for (int i=0; i < distances.length; i++) {
                int nx = currentX + distances[i][0];
                int ny = currentY + distances[i][1];

                if (nx >= 0 && nx < input.length
                        && ny >=0 && ny < input[0].length
                        && input[nx][ny] > input[currentX][currentY]) {
                    input[nx][ny] = input[currentX][currentY] + 1;

                    queue.add(Arrays.asList(nx, ny));
                }
            }
        }

        return input;
    }
}
