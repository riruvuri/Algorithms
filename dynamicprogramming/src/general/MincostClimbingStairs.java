package general;

import java.util.ArrayList;

public class MincostClimbingStairs {

    static Integer min_cost_climbing_stairs(ArrayList<Integer> cost) {
        int[] table = new int[cost.size() + 1];
        // Base case
        table[0] = 0;
        table[1] = cost.get(0);

        for (int i=2; i < cost.size() + 1; i++) {
            table[i] = cost.get(i-1) + Math.min(table[i-1], table[i-2]);
        }

        return Math.min(table[table.length-1], table[table.length-2]);
    }



}
