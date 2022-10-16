package medium42.kth_smallest_bst;

import binarysearchtrees.algorithm.BinaryTreeNode;

import java.util.Stack;

public class KthSmallestBSTIterative {

    public int findKthSmallest(BinaryTreeNode root, int k) {

        BinaryTreeNode current = root;
        Stack<BinaryTreeNode> stack = new Stack<>();
        int n = 0;
        while (current != null || stack.size() > 0) {
            if (current != null) {
                stack.push(current);
                current = current.left;
            } else {
                current = stack.pop();
                k--;
                if (k == 0) {
                    return current.value;
                }

                current = current.right;
            }
        }

        return -1;
    }
}
