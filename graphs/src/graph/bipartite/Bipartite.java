package graph.bipartite;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 * Time complexity:
 * O(Number of People + Number of Disliking pairs).
 * All the nodes and all the edges are traversed exactly once in a BFS traversal.
 *
 * Space complexity:
 * O(Number of People + Number of Disliking pairs).
 * Space used for input: O(Number of Disliking pairs).
 * Auxiliary space used: O(Number of People).
 * Space used for output: O(1).
 * So, total space complexity: O(Number of People + Number of Disliking pairs).
 */
public class Bipartite {
    public boolean isBipartite(Integer numOfPeople, List<Integer> dislike1, List<Integer> dislike2) {
        List<List<Integer>> adjList = new ArrayList<>();
        int[] visited = new int[numOfPeople];
        int[] level = new int[numOfPeople];

        for (int i=0; i < numOfPeople; i++) {
            adjList.add(new ArrayList<>());
            visited[i] = -1;
            level[i] = -1;
        }

        for (int i=0; i < dislike1.size(); i++) {
            adjList.get(dislike1.get(i)).add(dislike2.get(i));
            adjList.get(dislike2.get(i)).add(dislike1.get(i));
        }


        for (int i=0; i < numOfPeople; i++) {
            if (visited[i] == -1) {
                if (!bfs(i, visited, level, adjList)) {
                    return false;
                }
            }
        }

        return true;
    }

    private boolean bfs(int source, int[] visited, int[] level, List<List<Integer>> adjList) {
        visited[source] = 1;
        level[source] = 0;

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(source);

        while (!queue.isEmpty()) {
            source = queue.poll();
            List<Integer> neighbors = adjList.get(source);

            for (Integer neighbor : neighbors) {
                if (visited[neighbor] ==  -1) {
                    visited[neighbor] = 1;
                    queue.offer(neighbor);
                    level[neighbor] = level[source] + 1;
                } else {
                    if (level[neighbor] == level[source]) {
                        return false;
                    }
                }
            }

        }

        return true;
    }
}
