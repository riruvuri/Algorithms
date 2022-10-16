package medium34.construct_binary_tree;

import binarysearchtrees.algorithm.BinaryTreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * https://www.youtube.com/watch?v=O39qED_LghU
 */
public class ConstructBinaryTree {
    int[] preOrder = null;
    int[] inOrder = null;
    Map<Integer, Integer> hMap = new HashMap<>();
    int index = 0;
    public BinaryTreeNode buildTree(int[] preorder, int[] inorder) {
        this.preOrder = preorder;
        this.inOrder = inorder;

        int n = preorder.length;

        for (int i=0; i<n; i++) {
            hMap.put(inorder[i], i);
        }

        BinaryTreeNode binaryTreeNode = dfs(0, n-1);
        return binaryTreeNode;
    }

    private BinaryTreeNode dfs(int start, int end) {
        // base case
        if (start > end) {
            return null;
        }

        int currentElement = preOrder[index++];
        BinaryTreeNode binaryTreeNode = new BinaryTreeNode(currentElement);

        // Find the left boundary
        int mid = hMap.get(currentElement);

        binaryTreeNode.left = dfs(start, mid-1);
        binaryTreeNode.right = dfs(mid+1, end);

        return binaryTreeNode;
    }
}
