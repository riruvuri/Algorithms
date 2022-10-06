package medium39.min_height_trees;

import java.util.*;

public class MinHeightTrees {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        // Find all the edges in the graph
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i=0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }

        //int[] degree = new int[n];
        for (int[] currentEdge : edges) {
            //degree[currentEdge[0]]++;
            //degree[currentEdge[1]]++;
            adjList.get(currentEdge[0]).add(currentEdge[1]);
            adjList.get(currentEdge[1]).add(currentEdge[0]);
        }

        Queue<Integer> queue = new LinkedList<>();
        // Scan over all the elements and find the vertex that has degree of 1
        for (int i=0; i < adjList.size(); i++) {
            if (adjList.get(i).size() == 1) {
                queue.add(i);
            }
        }

        while (n > 2) {
            int size = queue.size();
            n -= size;

            while (size-- > 0) {
                int vertex = queue.poll();
                for (int neighbor : adjList.get(vertex)) {
                    adjList.get(neighbor).remove(Integer.valueOf(vertex));
                    if (adjList.get(neighbor).size() == 1) {
                        queue.add(neighbor);
                    }
                }
            }
        }

        return new ArrayList<>(queue);
    }
}
