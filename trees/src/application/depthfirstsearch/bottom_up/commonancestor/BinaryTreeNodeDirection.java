package application.depthfirstsearch.bottom_up.commonancestor;

import binarysearchtrees.algorithm.BinaryTreeNode;

import java.util.Stack;
import java.util.stream.Collectors;

/**
 * https://leetcode.com/problems/step-by-step-directions-from-a-binary-tree-node-to-another/
 *
 * Find the shortest path starting from node s and ending at node t. Generate step-by-step directions of such path as a string consisting of only the uppercase letters 'L', 'R', and 'U'. Each letter indicates a specific direction:
 *
 * 'L' means to go from a node to its left child node.
 * 'R' means to go from a node to its right child node.
 * 'U' means to go from a node to its parent node.
 * Return the step-by-step directions of the shortest path from node s to node t.
 */
public class BinaryTreeNodeDirection {
    String result = "";

    public String getDirections(BinaryTreeNode root, int startValue, int destValue) {
        BinaryTreeNode ancestorNode = findCommonAncestor(root, startValue, destValue);

        if (ancestorNode != null) {
            Stack<Character> stack = new Stack<>();
            findPathToAncestor(ancestorNode, startValue, stack);

            result = result.replace('L','U');
            result = result.replace('R','U');

            findPathToAncestor(ancestorNode, destValue, stack);
        }

        return result;
    }

    private boolean findPathToAncestor(BinaryTreeNode ancestorNode, int startValue, Stack<Character> stack) {
        if (ancestorNode.value == startValue) {
            result += stack.stream().map(String::valueOf).collect(Collectors.joining());
            return true;
        }

        boolean foundPath = false;
        if (ancestorNode.left != null) {
            stack.push('L');
            foundPath = findPathToAncestor(ancestorNode.left, startValue, stack);
            stack.pop();
        }

        if (!foundPath && ancestorNode.right != null) {
            stack.push('R');
            foundPath = findPathToAncestor(ancestorNode.right, startValue, stack);
            stack.pop();
        }

        return foundPath;
    }

    private BinaryTreeNode findCommonAncestor(BinaryTreeNode root, int startValue, int destValue) {
        if (root.value == startValue || root.value == destValue) {
            return root;
        }

        BinaryTreeNode leftNode = null;
        if (root.left != null) {
            leftNode = findCommonAncestor(root.left, startValue, destValue);
        }

        BinaryTreeNode rightNode = null;
        if (root.right != null) {
            rightNode = findCommonAncestor(root.right, startValue, destValue);
        }

        if (leftNode != null && rightNode != null) {
            return root;
        }

        return leftNode != null ? leftNode : rightNode;
    }
}
