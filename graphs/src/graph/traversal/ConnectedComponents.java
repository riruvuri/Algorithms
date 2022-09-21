package graph.traversal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConnectedComponents {
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

        List<Integer> outputList = new ArrayList<>();
        int connectedId = 0;
        for (int i=0; i < n; i++) {
            if (visited[i] == -1) {
                dfs(i, adjacencyList, visited, parent, outputList, ++connectedId);
            }
        }

        return connectedId;
    }

    private void dfs(int vertex, List<List<Integer>> adjacencyList, int[] visited, int[] parent, List<Integer> outputList, int connectedId) {
        visited[vertex] = connectedId;
        outputList.add(vertex);

        List<Integer> neighborList = adjacencyList.get(vertex);
        for (Integer neighbor : neighborList) {
            if (visited[neighbor] == -1) {
                //visited[neighbor] = 1;
                parent[neighbor] = vertex;

                dfs(neighbor, adjacencyList, visited, parent, outputList, connectedId);
            }
        }
    }
}
