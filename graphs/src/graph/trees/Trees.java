package graph.trees;

import java.util.*;

public class Trees {

    public boolean isGraphATree(int n, List<List<Integer>> edges) {
        // Prepare adjacency list
        List<List<Integer>> adjacencyList = new ArrayList<>();
        for (int i=0; i < n; i++) {
            List<Integer> vertexAdjacencyList = new ArrayList<>();
            adjacencyList.add(i, vertexAdjacencyList);
        }

        for (int i=0; i < edges.size(); i++) {
            List<Integer> currentEdge = edges.get(i);
            adjacencyList.get(currentEdge.get(0)).add(currentEdge.get(1));
            adjacencyList.get(currentEdge.get(1)).add(currentEdge.get(0));
        }

        int[] visited = new int[n];
        Arrays.fill(visited, -1);

        int[] parent = new int[n];
        Arrays.fill(parent, -1);

        int connected = 0;
        for (int i=0; i < n;i++) {
            if (visited[i] == -1) {
                if (connected < 1
                        && bfs(i, visited, parent, adjacencyList)) {
                    connected++;
                } else {
                    return false;
                }
            }
        }

        return true;
    }

    boolean bfs(int node, int[] visited, int[] parent, List<List<Integer>> adjacencyList) {
        visited[node] = 1;
        parent[node] = -1;
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(node);

        while (!queue.isEmpty()) {
            int vertex = queue.poll();

            for (int neighbor : adjacencyList.get(vertex)) {
                if (visited[neighbor] == -1) {
                    visited[neighbor] = 1;
                    parent[neighbor] = vertex;

                    queue.offer(neighbor);
                } else {
                    if (neighbor != parent[vertex]) {
                        return false;
                    }
                }
            }
        }

        return true;
    }
}
