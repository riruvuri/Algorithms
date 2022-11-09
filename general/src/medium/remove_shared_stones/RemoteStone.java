package medium.remove_shared_stones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * LC: 947
 *
 * https://leetcode.com/problems/most-stones-removed-with-same-row-or-column/solutions/1587104/java-simple-dfs-85-speed-o-n-with-explanation/
 */
public class RemoteStone {
    int removeStones(int[][] stones) {
        Map<Integer, List<Integer>> adjRowMap = new HashMap<>();
        Map<Integer, List<Integer>> adjColMap = new HashMap<>();

        for (int i=0; i < stones.length; i++) {
            int[] stoneLocation = stones[i];
            adjRowMap.computeIfAbsent(stoneLocation[0], o -> new ArrayList<>()).add(i);
            adjColMap.computeIfAbsent(stoneLocation[1], o -> new ArrayList<>()).add(i);
        }

        int connectedComponents = 0;
        boolean[] visited = new boolean[stones.length];
        for (int i=0; i < stones.length; i++) {
            if (!visited[i]) {
                dfs(stones, visited, adjRowMap, adjColMap, i);
                connectedComponents++;
            }
        }

        return stones.length - connectedComponents;
    }

    private void dfs(int[][] stones, boolean[] visited,
                    Map<Integer, List<Integer>> adjRowMap,
                    Map<Integer, List<Integer>> adjColMap, int i) {
        if (visited[i]) {
            return;
        }

        visited[i] = true;
        int currentRow = stones[i][0];
        int currentCol = stones[i][1];

        for (int neighborStone : adjRowMap.get(currentRow)) {
            dfs(stones, visited, adjRowMap, adjColMap, neighborStone);
        }

        for (int neighborStone : adjColMap.get(currentCol)) {
            dfs(stones, visited, adjRowMap, adjColMap, neighborStone);
        }
    }
}
