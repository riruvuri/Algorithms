package graph.trees;

import java.util.ArrayList;
import java.util.List;

public class TreesDFS_NotWorking {

    public Boolean isItATree(Integer node_count, List<Integer> edge_start, List<Integer> edge_end) {

        List<List<Integer>> adjList = new ArrayList<>();
        int[] visited = new int[node_count];
        int[] level = new int[node_count];

        for (int i=0; i < node_count; i++) {
            adjList.add(new ArrayList<>());
            visited[i] = -1;
            level[i] = -1;
        }

        for (int i=0; i < edge_start.size(); i++) {
            adjList.get(edge_start.get(i)).add(edge_end.get(i));
            adjList.get(edge_end.get(i)).add(edge_start.get(i));
        }


        int count = 0;
        for (int i=0; i < node_count; i++) {
            if (visited[i] == -1) {
                if (count < 1 && !hasCycle(i, visited, level, adjList, 0)) {
                    count++;
                } else {
                    return false;
                }
            }
        }


        return true;
    }

    boolean hasCycle(int vertex, int[] visited, int[] level, List<List<Integer>> adjList, int currentLevel) {
        visited[vertex] = 1;
        level[vertex] = currentLevel;

        List<Integer> neighbors = adjList.get(vertex);
        for (int neighbor : neighbors) {
            if (visited[neighbor] == -1) {
                if (hasCycle(neighbor, visited, level, adjList, currentLevel+1)) {
                    return true;
                }
            } else {
                if (level[neighbor] == currentLevel) {
                    return true;
                }
            }
        }
        return false;
    }
}
