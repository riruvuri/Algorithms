package application.depthfirstsearch.bottom_up.max_path_sum;

import binarysearchtrees.algorithm.BinaryTreeNode;

/**
 * LC: 124 Binary Tree Maximum Path Sum
 *
 * https://www.youtube.com/watch?v=6cA_NDtpyz8
 *
 * Time Complexity: O(n)
 * Space complexity: O(H), H is the height of the tree. In the case of a balanced tree it is H= log N, but for the
 * skewed tree H=N
 */
public class MaxPathSum {
    int max_sum = Integer.MIN_VALUE;

    public int max_gain(BinaryTreeNode node) {
        if (node == null) return 0;

        // max sum on the left and right sub-trees of node
        int left_gain = Math.max(max_gain(node.left), 0);
        int right_gain = Math.max(max_gain(node.right), 0);

        // the price to start a new path where `node` is a highest node
        int price_newpath = node.value + left_gain + right_gain;

        // update max_sum if it's better to start a new path
        max_sum = Math.max(max_sum, price_newpath);

        // for recursion :
        // return the max gain if continue the same path
        return node.value + Math.max(left_gain, right_gain);
    }

    public int maxPathSum(BinaryTreeNode root) {
        max_gain(root);
        return max_sum;
    }
}
