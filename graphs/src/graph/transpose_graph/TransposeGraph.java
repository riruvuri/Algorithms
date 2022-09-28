package graph.transpose_graph;

import java.util.*;

/**
 *  * TC: O(n ^ 2)
 *  * SC: O(n ^ 2)
 */
public class TransposeGraph {
    public GraphNode buildGraph(GraphNode node) {
        Set<Integer> visited = new HashSet<>();
        Map<GraphNode, GraphNode> cloneMap = new HashMap<>();

        dfs(node, visited, cloneMap);

        // Reverse direction of children
        Set<GraphNode> graphNodeSet = cloneMap.keySet();
        for (GraphNode mainNode : graphNodeSet) {
            GraphNode clonedParent = cloneMap.get(mainNode);

            for (GraphNode neighbor : mainNode.neighbors) {
                GraphNode clonedChild = cloneMap.get(neighbor);
                clonedChild.neighbors.add(clonedParent);
            }
        }

        return cloneMap.get(node);
    }

    private void dfs(GraphNode node, Set<Integer> visited, Map<GraphNode, GraphNode> cloneMap) {
        visited.add(node.value);

        cloneMap.put(node, new GraphNode(node.value));

        for (GraphNode neighbor : node.neighbors) {
            if (!visited.contains(neighbor.value)) {
                dfs(neighbor, visited, cloneMap);
            }
        }
    }
}


class GraphNode {
    Integer value;
    ArrayList<GraphNode> neighbors;

    GraphNode(Integer value) {
        this.value = value;
        this.neighbors = new ArrayList(3);
    }
}