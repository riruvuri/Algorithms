package medium.spiral_order;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SpriralOrder {
    final int VISITED = 101;
    public List<Integer> spiralOrder(int[][] matrix) {
        int totalIterations = matrix.length * matrix[0].length;
        int[][] directions = {{0,1}, {1,0}, {0,-1}, {-1,0}};
        List<Integer> result = new ArrayList<>();

        int defaultDirection = 0;
        int[] startIndex = {0,0};
        result.add(matrix[0][0]);
        matrix[0][0] = VISITED;

        for (int i=0; i < totalIterations; i++) {
            defaultDirection = defaultDirection % 4;
            int currentRow = startIndex[0] + directions[defaultDirection][0];
            int currentCol = startIndex[1] + directions[defaultDirection][1];

            if (currentRow < 0 || currentRow > matrix.length - 1
                    || currentCol < 0 || currentCol > matrix[0].length - 1
                    || matrix[currentRow][currentCol] == VISITED) {
                defaultDirection++;
                if (i == totalIterations -1) {
                    break;
                }
                i--;
                continue;
            }

            startIndex[0] = currentRow;
            startIndex[1] = currentCol;

            result.add(matrix[currentRow][currentCol]);
            matrix[currentRow][currentCol] = VISITED;
        }

        return result;
    }
}
