package general;

import java.util.ArrayList;

public class MaximumPathSum {

    static Integer maximum_path_sum(ArrayList<ArrayList<Integer>> grid) {
        int[][] table = new int[grid.size()][grid.get(0).size()];

        table[0][0] = grid.get(0).get(0);
        // Base case
        for (int i=1; i < grid.size(); i++) {
            table[i][0] = grid.get(i).get(0) + table[i-1][0];
        }
        for (int j=1; j < grid.get(0).size(); j++) {
            table[0][j] = grid.get(0).get(j) + table[0][j-1];
        }

        for (int i=1; i < grid.size(); i++) {
            for (int j=1; j < grid.get(0).size(); j++) {
                table[i][j] = grid.get(i).get(j) + Math.max(table[i-1][j], table[i][j-1]);
            }
        }


        return table[grid.size()-1][grid.get(0).size()-1];
    }

}
