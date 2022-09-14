package application.depthfirstsearch.verticaltraversal;

import binarysearchtrees.algorithm.BinaryTreeNode;

import java.util.*;

public class VerticalTraversal {
    public ArrayList<ArrayList<Integer>> getElementsByVerticalTraversal(BinaryTreeNode binaryTreeNode) {
        return verticalTraversalHelper(binaryTreeNode);
    }

    private ArrayList<ArrayList<Integer>> verticalTraversalHelper(BinaryTreeNode binaryTreeNode) {
        if (binaryTreeNode == null) {
            return new ArrayList<>();
        }

        Pair root = new Pair(binaryTreeNode, 0);
        Queue<Pair> nodeQueue = new LinkedList<>();
        nodeQueue.offer(root);

        Map<Integer, List<BinaryTreeNode>> nodeListByLevel = new HashMap<>();
        Integer minLevel = Integer.MAX_VALUE;
        Integer maxLevel = Integer.MIN_VALUE;

        while (!nodeQueue.isEmpty()) {
            int qsize = nodeQueue.size();

            while (qsize-- > 0) {
                Pair nodeLevel = nodeQueue.poll();
                BinaryTreeNode currentNode = nodeLevel.node;

                List<BinaryTreeNode> nodeList = nodeListByLevel.getOrDefault(nodeLevel.level, new ArrayList<>());
                nodeList.add(currentNode);

                nodeListByLevel.put(nodeLevel.level, nodeList);
                minLevel = Math.min(minLevel, nodeLevel.level);
                maxLevel = Math.max(maxLevel, nodeLevel.level);

                if (currentNode.left != null) {
                    nodeQueue.offer(new Pair(currentNode.left, nodeLevel.level - 1));
                }

                if (currentNode.right != null) {
                    nodeQueue.offer(new Pair(currentNode.right, nodeLevel.level + 1));
                }
            }
        }

        ArrayList<ArrayList<Integer>> outputList = new ArrayList<>();
        for (int i=minLevel; i <= maxLevel; i++) {
            List<BinaryTreeNode> nodeList = nodeListByLevel.get(i);
            outputList.add(new ArrayList<>(nodeList.stream().map(a -> a.value).toList()));
        }
        return outputList;
    }
}

class Pair {
    BinaryTreeNode node;
    int level;

    Pair(BinaryTreeNode node, int level) {
        this.node = node;
        this.level = level;
    }
}
