package graph.traversal;

import java.util.*;

public class DFSTraversal {
    public List<Integer> dfsTraversal(int n, List<List<Integer>> edges) {
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
        for (int i=0; i < n; i++) {
            if (visited[i] == -1) {
                dfs(i, adjacencyList, visited, parent, outputList);
            }
        }

        return outputList;
    }

    private void dfs(int vertex, List<List<Integer>> adjacencyList, int[] visited, int[] parent, List<Integer> outputList) {
        Stack<Integer> stack = new Stack<>();
        stack.push(vertex);
        visited[vertex] = 1;
        parent[vertex] = -1;

        while (!stack.isEmpty()) {
            int size = stack.size();

            while (size-- > 0) {
                Integer node = stack.pop();
                outputList.add(node);

                List<Integer> neighborList = adjacencyList.get(node);
                for (Integer i : neighborList) {
                    if (visited[i] == -1) {
                        stack.push(i);
                        visited[i] = 1;
                        parent[i] = node;
                    }
                }
            }
        }
    }
}
