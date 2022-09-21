package graph.traversal;

import java.util.*;

public class ConnectedComponentsBFS {
    public Integer findConnectedComponents(int n, List<List<Integer>> edges) {
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
                connected++;
                bfs(i, visited, parent, adjacencyList);
            }
        }

        return connected;
    }

    void bfs(int node, int[] visited, int[] parent, List<List<Integer>> adjacencyList) {
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
                }
            }
        }
    }
}
