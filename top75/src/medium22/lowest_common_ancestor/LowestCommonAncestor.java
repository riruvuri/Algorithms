package medium22.lowest_common_ancestor;

import binarysearchtrees.algorithm.BinaryTreeNode;

public class LowestCommonAncestor {
    public BinaryTreeNode findAncestor(BinaryTreeNode root, BinaryTreeNode p , BinaryTreeNode q) {
        return helper(root, p, q);
    }

    private BinaryTreeNode helper(BinaryTreeNode root, BinaryTreeNode p, BinaryTreeNode q) {
        if (root == null) {
            return null;
        }

        if (root.value == p.value || root.value == q.value) {
            return root;
        }

        BinaryTreeNode left = helper(root.left, p, q);
        BinaryTreeNode right = helper(root.right, p, q);

        if (left != null && right != null) {
            return root;
        }

        return left != null ? left : right;
    }
}
