package application.depthfirstsearch;

import binarysearchtrees.algorithm.BinaryTreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * LC# 113
 *
 */
public class PathSums {
    public ArrayList<ArrayList<Integer>> allPathSums(BinaryTreeNode root, Integer k) {
        ArrayList<ArrayList<Integer>> allPaths = new ArrayList<>();
        Stack<Integer> slate = new Stack<>();

        pathHelper(allPaths, root, slate, k);

        if (allPaths.isEmpty()) {
            ArrayList<Integer> output = new ArrayList<>();
            output.add(-1);
            allPaths.add(output);
        }

        return allPaths;
    }

    private void pathHelper(ArrayList<ArrayList<Integer>> outputList,
                           BinaryTreeNode treeNode,
                           Stack<Integer> slate,
                           long target) {
        slate.add(treeNode.value);
        target -= treeNode.value;
        // Base case - leaf node
        if (treeNode.left == null && treeNode.right == null) {
            if (target == 0) {
                List<Integer> output = slate.stream().toList();
                outputList.add(new ArrayList<>(output));
            }
            return;
        }

        if (treeNode.left != null) {
            pathHelper(outputList, treeNode.left, slate, target);
            slate.pop();
        }

        if (treeNode.right != null) {
            pathHelper(outputList, treeNode.right, slate, target);
            slate.pop();
        }
    }
}